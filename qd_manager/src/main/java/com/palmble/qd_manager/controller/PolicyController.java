package com.palmble.qd_manager.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.palmble.qd_manager.Transponder;
import com.palmble.qd_manager.bean.ApplicantNode;
import com.palmble.qd_manager.bean.BasicNode;
import com.palmble.qd_manager.bean.BeneficiaryNode;
import com.palmble.qd_manager.bean.InsuredNode;
import com.palmble.qd_manager.bean.RestAPIResult;
import com.palmble.qd_manager.bean.SaveParamsBean;
import com.palmble.qd_manager.bean.SearchMain;
import com.palmble.qd_manager.bean.SearchNode;
import com.palmble.qd_manager.bean.SurrenderParamsBean;
import com.palmble.qd_manager.bean.TransData;
import com.palmble.qd_manager.model.PolicyInfo;
import com.palmble.qd_manager.resultBean.ApplyResponse;
import com.palmble.qd_manager.resultBean.Insurances;
import com.palmble.qd_manager.resultBean.SurremderRespones;
import com.palmble.qd_manager.service.PolicyService;
import com.palmble.qd_manager.utils.RandomTranUtil;
import com.palmble.qd_manager.utils.XmlDeclarationXStream;
import com.palmble.qd_manager.xhpos.StandardPolicyPortType;

@RestController
public class PolicyController {
	@Autowired
	private StandardPolicyPortType standardPolicyPortType;
	protected Logger logger = LoggerFactory.getLogger(PolicyController.class);
	@Autowired
	private PolicyService policyService;
	private SimpleDateFormat dateFormat=new SimpleDateFormat("YYYYMMdd");
	private SimpleDateFormat timeFormat=new SimpleDateFormat("HHMMss");
	@RequestMapping("/savePolicy")
	public RestAPIResult savePolicy(SaveParamsBean s,
			InsuredNode insured,BeneficiaryNode beneficiary,BasicNode basic
			,ApplicantNode applicant,@RequestParam Map<String,Object> map) {
		RestAPIResult r=new RestAPIResult();
		
		s=policyService.initParams(s, insured, beneficiary, basic, applicant, map);
		ApplyResponse respnese=policyService.sendPolicyInfo(s);
		try {
			if(respnese.getResultStatus().getResultCode().equals("00")) {//投保成功,保存保单信息
				//保存保单方法
				policyService.save(s,respnese);
				r.setRespCode(0);
				r.setRespMsg(respnese.getResultStatus().getResultMsg());
			}else {//投保失败
				r.setDataCode("1");
				r.setRespMsg(respnese.getResultStatus().getResultMsg());
			}
		} catch (Exception e) {
			r.setRespMsg(e.getMessage());
			e.printStackTrace();
		}
		return r;
	}
	
	/**
	 * <p>Title: 获取保单详情</p>   
	 * @author WangYanke  
	 * @return 
	 * @date 2018年6月25日
	 */
	@GetMapping("/searchPolicy")
	public String searchPolicy(@RequestParam Long id) {
		String url="http://180.76.98.239:8888/test2";
		PolicyInfo policyInfo = policyService.selectByPrimaryKey(id);//获取保单内容信息
		SearchNode node=new SearchNode();
		SearchMain main=new SearchMain();
		if(policyInfo!=null) {
			main.setInsuranceNo(policyInfo.getInsuranceNo());
		}
		node.setMain(main);
		XmlDeclarationXStream st=new XmlDeclarationXStream();
		st.processAnnotations(SearchNode.class);
		String xml = "xml="+st.toXML(node);
		System.out.println(xml);
		//180.76.98.239
		String result="";
		ApplyResponse respnese=null;
		try {
			result=Transponder.sendPost(url, xml, true);
			st.processAnnotations(ApplyResponse.class);//启用注解
			respnese = (ApplyResponse)st.fromXML(result);
			System.out.println("**********************"+respnese.getResultStatus().getResultMsg());
			logger.debug("保单获取成功,本次查询保单号:"+respnese.getMain().getInsurances().get(0).getInsuranceNo());
		} catch (Exception e) {
			logger.error("----------------获取保单详情接口调用异常---------------------------");
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * <p>Title:保单退保接口</p>   
	 * @author WangYanke  
	 * @return 
	 * @date 2018年6月25日
	 */
	@GetMapping("/surrenderPolicy")
	public RestAPIResult surrenderPolicy(Long id) {
		String url="http://180.76.98.239:8888/surrender";
		RestAPIResult r=new RestAPIResult();
		r.setRespCode(0);
		r.setRespMsg("成功");
		PolicyInfo policyInfo = policyService.selectByPrimaryKey(id);//获取保单内容信息
		if(policyInfo==null) {
			r.setRespCode(1);
			r.setRespMsg("获取保单号失败");
			return r;
		}
		Calendar rightNow = Calendar.getInstance();
		List<Insurances> list=new ArrayList<>();
		TransData trans=new  TransData();
		Insurances insurances=new Insurances();
		insurances.setInsuranceNo(policyInfo.getInsuranceNo());//保单号为空时 ,原流水号下的所有保单全部退保
		list.add(insurances);
		trans.setInsurances(list);
		trans.setTransDate(dateFormat.format(rightNow.getTime()));
		trans.setTransTime(timeFormat.format(rightNow.getTime()));
		trans.setSellFormType(policyInfo.getSellFormType());
		trans.setTransID(policyInfo.getTransId());//投保流水号
		SurrenderParamsBean surrenderParams=new SurrenderParamsBean();
		surrenderParams.setTransData(trans);
		XmlDeclarationXStream st=new XmlDeclarationXStream();
		st.processAnnotations(SurrenderParamsBean.class);
		//st.alias("", Insurances.class);
		String xml="xml="+st.toXML(surrenderParams);
		 //调用toXML 将对象转成字符串
		System.out.println(xml);
		String result="";
		try {
			result=Transponder.sendPost(url, xml, true);
			st.processAnnotations(SurremderRespones.class);
			SurremderRespones respnese= (SurremderRespones)st.fromXML(result);
			System.out.println("**********************"+respnese.getTransData().getResultMsg());
			logger.debug("接口调取成功,本次退保单号:"+respnese.getTransData().getTransID());
			System.out.println(result);
		} catch (Exception e) {
			logger.error("----------------退保接口调用异常---------------------------");
			r.setDataCode("1");
			//r.setRespMsg(respnese.getTransData().getResultMsg());
			e.printStackTrace();
		}
		
		return r;
	}
	
	@RequestMapping("policyList")
	public List<PolicyInfo> getAllPolicy() {
		return policyService.getAllPolicy();
	}
	
	
}
