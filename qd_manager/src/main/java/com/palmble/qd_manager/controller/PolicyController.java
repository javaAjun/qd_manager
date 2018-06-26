package com.palmble.qd_manager.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
import com.palmble.qd_manager.bean.SearchNode;
import com.palmble.qd_manager.bean.SearchParamsBean;
import com.palmble.qd_manager.model.PolicyInfo;
import com.palmble.qd_manager.service.PolicyService;
import com.palmble.qd_manager.utils.RandomTranUtil;
import com.palmble.qd_manager.utils.XmlUtil;
//import com.palmble.qd_manager.xhpos.StandardPolicyPortType;

@RestController
public class PolicyController {
	/*@Autowired
	private StandardPolicyPortType standardPolicyPortType;*/
	
	@Autowired
	PolicyService policyService;
	@RequestMapping("/savePolicy")
	public RestAPIResult savePolicy(SaveParamsBean s,
			InsuredNode insured,BeneficiaryNode beneficiary,BasicNode basic
			,ApplicantNode applicant,@RequestParam Map<String,Object> map) {
		RestAPIResult r=new RestAPIResult();
		r.setRespCode(0);
		r.setRespMsg("成功");
		basic.setTransID(RandomTranUtil.getTrandNo());
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYYMMDD");
		SimpleDateFormat timeFormat=new SimpleDateFormat("HHMMSS");
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
		rightNow.add(Calendar.DAY_OF_YEAR,-3);
		basic.setEffectDate(dateFormat.format(rightNow.getTime()));
		basic.setEffectTime(timeFormat.format(rightNow.getTime()));
		rightNow.setTime(now);
		rightNow.add(Calendar.YEAR,years);
		basic.setExpiryDate(dateFormat.format(rightNow.getTime()));
		basic.setExpiryTime(timeFormat.format(rightNow.getTime()));
		s.setInsured(insured);
		s.setApplicant(applicant);
		s.setMain(basic);
		s.setBeneficiary(beneficiary);
		String xml=XmlUtil.getXmlString(s);
		try {
			String result=Transponder.send(xml);
			r.setRespMsg(result);
		} catch (IOException e) {
			r.setRespMsg(e.getMessage());
			e.printStackTrace();
		}
		return r;
	}
	public static void main(String[] args) throws ParseException {
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	        String str="20110101";
	        Date dt=sdf.parse(str);
	        Calendar rightNow = Calendar.getInstance();
	        rightNow.setTime(dt);
	        rightNow.add(Calendar.DAY_OF_YEAR,+10);//日期加10天
	        Date dt1=rightNow.getTime();
	        String reStr = sdf.format(dt1);
	        System.out.println(reStr);
	}
	
	/**
	 * <p>Title: 获取保单详情</p>   
	 * @author WangYanke  
	 * @date 2018年6月25日
	 */
	@GetMapping("/searchPolicy")
	public void searchPolicy(@RequestParam Long id) {
		PolicyInfo policyInfo = policyService.selectByPrimaryKey(id);//获取保单内容信息
		SearchNode node=new SearchNode();
		node.setInsuranceNo(policyInfo.getInsuranceNo());
		node.setTransSignature(policyInfo.getTransSignaTure());
		SearchParamsBean search=new SearchParamsBean();
		search.setMain(node);
		String xml=XmlUtil.getXmlString(search);
		System.out.println(xml);
	}
	
	/**
	 * <p>Title:保单退保接口</p>   
	 * @author WangYanke  
	 * @date 2018年6月25日
	 */
	@RequestMapping("/保单退保")
	public void surrenderPolicy(@RequestParam Long id) {
		
	}
	
	@RequestMapping("policyList")
	public List<PolicyInfo> getAllPolicy() {
		return policyService.getAllPolict();
	}
	
	
}
