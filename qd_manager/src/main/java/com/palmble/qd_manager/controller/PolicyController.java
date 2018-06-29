package com.palmble.qd_manager.controller;

import java.io.IOException;
import java.io.OutputStream;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.palmble.qd_manager.Transponder;
import com.palmble.qd_manager.bean.ApplicantNode;
import com.palmble.qd_manager.bean.BasicNode;
import com.palmble.qd_manager.bean.BeneficiaryNode;
import com.palmble.qd_manager.bean.InsuredNode;
import com.palmble.qd_manager.bean.PolicySet;
import com.palmble.qd_manager.bean.RestAPIResult;
import com.palmble.qd_manager.bean.SaveParamsBean;
import com.palmble.qd_manager.bean.SearchNode;
import com.palmble.qd_manager.bean.SearchParamsBean;
import com.palmble.qd_manager.bean.SurrenderParamsBean;
import com.palmble.qd_manager.bean.TransData;
import com.palmble.qd_manager.model.PolicyInfo;
import com.palmble.qd_manager.resultBean.ApplyResponse;
import com.palmble.qd_manager.service.PolicyService;
import com.palmble.qd_manager.utils.RandomTranUtil;
import com.palmble.qd_manager.utils.XmlDeclarationXStream;
import com.palmble.qd_manager.utils.XmlUtil;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;
//import com.palmble.qd_manager.xhpos.StandardPolicyPortType;

@RestController
public class PolicyController {
	/*@Autowired
	private StandardPolicyPortType standardPolicyPortType;*/
	protected Logger logger = LoggerFactory.getLogger(PolicyController.class);
	@Autowired
	private PolicyService policyService;
	
	private SimpleDateFormat dateFormat=new SimpleDateFormat("YYYYMMDD");
	private SimpleDateFormat timeFormat=new SimpleDateFormat("HHMMss");
	@RequestMapping("/savePolicy")
	public RestAPIResult savePolicy(SaveParamsBean s,
			InsuredNode insured,BeneficiaryNode beneficiary,BasicNode basic
			,ApplicantNode applicant,@RequestParam Map<String,Object> map) {
		RestAPIResult r=new RestAPIResult();
		r.setRespCode(0);
		r.setRespMsg("成功");
		basic.setTransID(RandomTranUtil.getTrandNo());
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYYMMdd");
		SimpleDateFormat timeFormat=new SimpleDateFormat("HHMMss");
		Date now=new Date();
		basic.setTransDate(dateFormat.format(now));
		basic.setTransTime(timeFormat.format(now));
		Calendar rightNow = Calendar.getInstance();
		//保单年限
		Integer years=Integer.parseInt((String)map.get("years"));
		 rightNow.setTime(now);
		//TODO 这里暂时用随机数测试
		 basic.setPosCode("ISH00005");
		 basic.setSellFormType("EUN12007");
		//TODO 测试数据
		basic.setProductCode("66368025");
		/**
		 * 测试数据,被保人信息
		 */
		insured.setInsuredName("张晓东");
		insured.setInsuredNum("410325199006181077");
		insured.setInsuredSex("0");
		insured.setInsuredType("0");
		insured.setInsuredBirthDate("19900618");
		rightNow.add(Calendar.DAY_OF_YEAR,3);
		basic.setEffectDate(dateFormat.format(rightNow.getTime()));
		basic.setEffectTime(timeFormat.format(rightNow.getTime()));
		rightNow.setTime(now);
		rightNow.add(Calendar.DAY_OF_YEAR,years);
		basic.setExpiryDate(dateFormat.format(rightNow.getTime()));
		basic.setExpiryTime(timeFormat.format(rightNow.getTime()));
		s.setInsured(insured);
		s.setApplicant(applicant);
		s.setMain(basic);
		s.setBeneficiary(beneficiary);
		XmlDeclarationXStream st=new XmlDeclarationXStream(new DomDriver());
		/**
		 * 将对应实体名称变更为标签名,否则生成标签名为实体路径
		 */
		//st.alias("ApplyRequest", SaveParamsBean.class);
		/*st.alias("Main", BasicNode.class);
		st.alias("Insured", InsuredNode.class);
		st.alias("Applicant", ApplicantNode.class);
		st.alias("Beneficiary", BeneficiaryNode.class);*/
		st.processAnnotations(SaveParamsBean.class);//启用注解
		String xml = "xml="+st.toXML(s);
		//String xml="xml="+XmlUtil.getXmlString(s);
		//String url=(String)map.get("url");
		String  url="http://180.76.98.239:8888/test1";
		try {
			//182.92.99.67
			String result=Transponder.sendPost(url, xml, true);
			st.processAnnotations(ApplyResponse.class);//启用注解
			ApplyResponse respnese = (ApplyResponse)st.fromXML(result);
			System.out.println("**********************"+respnese.getResultStatus().getResultMsg());
			if(respnese.getResultStatus().getResultCode().equals("00")) {//投保成功,保存保单信息
				PolicyInfo policyInfo=new PolicyInfo();
				
				
				
				
				
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
		node.setInsuranceNo(policyInfo.getInsuranceNo());
		node.setTransSignature(policyInfo.getTransSignaTure());
		SearchParamsBean search=new SearchParamsBean();
		search.setMain(node);
		String xml=XmlUtil.getXmlString(search);
		System.out.println(xml);
		//180.76.98.239
		String result="";
		try {
			result=Transponder.sendPost(url, xml, true);
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
	public String surrenderPolicy( Long id) {
		String url="http://180.76.98.239:8888/test3";
		PolicyInfo policyInfo = policyService.selectByPrimaryKey(id);//获取保单内容信息
		Date now=new Date();
		List<String> list=new ArrayList<>();
		TransData trans=new  TransData();
		PolicySet policy1=new PolicySet();
		
		list.add("1111111");
		list.add("2222222");
		list.add("3333333");
		policy1.setInsuranceNo(list);
		trans.setInsurances(policy1);
		trans.setTransDate(dateFormat.format(now));
		trans.setTransTime(timeFormat.format(now));
		trans.setSellFormType(policyInfo.getSellFormType());
		trans.setTransID(policyInfo.getTransId());
		SurrenderParamsBean surrenderParams=new SurrenderParamsBean();
		surrenderParams.setTransData(trans);
		XmlDeclarationXStream st=new XmlDeclarationXStream();
		st.alias("CancelRequest", SurrenderParamsBean.class);
		st.alias("TransData", TransData.class);
		st.alias("Insurances", PolicySet.class);
		String xml=st.toXML(surrenderParams);
		 //调用toXML 将对象转成字符串
		System.out.println(xml);
		String result="";
		try {
			result=Transponder.sendPost(url, xml, true);
		} catch (Exception e) {
			logger.error("----------------获取保单详情接口调用异常---------------------------");
			e.printStackTrace();
		}
		
		return result;
	}
	
	@RequestMapping("policyList")
	public List<PolicyInfo> getAllPolicy() {
		return policyService.getAllPolict();
	}
	
	
}
