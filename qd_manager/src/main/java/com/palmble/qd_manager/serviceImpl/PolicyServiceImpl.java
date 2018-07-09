package com.palmble.qd_manager.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.palmble.qd_manager.Transponder;
import com.palmble.qd_manager.bean.ApplicantNode;
import com.palmble.qd_manager.bean.BasicNode;
import com.palmble.qd_manager.bean.BeneficiaryNode;
import com.palmble.qd_manager.bean.InsuredNode;
import com.palmble.qd_manager.bean.SaveParamsBean;
import com.palmble.qd_manager.dal.PolicyInfoDao;
import com.palmble.qd_manager.model.PolicyInfo;
import com.palmble.qd_manager.resultBean.ApplyResponse;
import com.palmble.qd_manager.resultBean.Insurances;
import com.palmble.qd_manager.resultBean.Main;
import com.palmble.qd_manager.service.PolicyService;
import com.palmble.qd_manager.utils.RandomTranUtil;
import com.palmble.qd_manager.utils.XmlDeclarationXStream;
import com.palmble.qd_manager.xhpos.StandardPolicyPortType;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyInfoDao policyInfoDao;
	private SimpleDateFormat dateFormat=new SimpleDateFormat("YYYYMMdd");
	private SimpleDateFormat timeFormat=new SimpleDateFormat("HHMMss");
	public PolicyInfo selectByPrimaryKey(Long id) {
		return policyInfoDao.getById(id);
	}


	@Override
	public int deleteByPrimaryKey(Long id) {
		return policyInfoDao.deleteById(id);
	}

	@Override
	public int insert(PolicyInfo record) {
		return policyInfoDao.insertFully(record);
	}

	@Override
	public int insertSelective(PolicyInfo record) {
		return policyInfoDao.insert(record);
	}

	@Override
	public int updateByPrimaryKeySelective(PolicyInfo record) {
		return policyInfoDao.updateById(record);
	}

	@Override
	public int updateByPrimaryKey(PolicyInfo record) {
		return policyInfoDao.updateFullyById(record);
	}

	@Override
	public List<PolicyInfo> getByUserId(Long userId) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("userId", userId);
		return policyInfoDao.find(map);
	}
	
	@Autowired
	private StandardPolicyPortType standardPolicyPortType;
	
	@Override
	public void save(SaveParamsBean s,ApplyResponse respnese) {
		//保存保单方法
		BasicNode basic=s.getMain();
		List<Insurances> list=respnese.getMain().getInsurances();
		Main resMain=respnese.getMain();
		for(Insurances insurances:list) {
			PolicyInfo policyInfo=new PolicyInfo();
			policyInfo.setTransId(basic.getTransID());
			policyInfo.setTransDate(basic.getTransDate());
			policyInfo.setTransTime(basic.getTransTime());
			policyInfo.setTransType(basic.getTransType());
			policyInfo.setSourceId(basic.getSourceID());
			policyInfo.setOrderId(basic.getOrderID());
			policyInfo.setPosCode(basic.getPosCode());
			policyInfo.setSellFormType(basic.getSellFormType());
			policyInfo.setProductCode(basic.getProductCode());
			policyInfo.setInsuranceNo(insurances.getInsuranceNo());
			policyInfo.setEffectDate(resMain.getEffectDate());
			policyInfo.setEffectTime(basic.getEffectTime());
			policyInfo.setExpiryDate(resMain.getExpiryDate());
			policyInfo.setExpiryTime(basic.getExpiryTime());
			String amountStr=resMain.getAmount();
			Double amountNum=null;
			if(amountStr!=null&&!amountStr.trim().equals("")) {
				amountNum=Double.parseDouble(amountStr);
			}
			policyInfo.setAmount(amountNum);
			String premiumStr=resMain.getPremium();
			Double premiumNum=null;
			if(premiumStr!=null&&!premiumStr.trim().equals("")) {
				premiumNum=Double.parseDouble(premiumStr);
			}
			policyInfo.setPremium(premiumNum);
			String totalPermiumStr=resMain.getTotalPremium();
			Double totalPermiumNum=null;
			if(totalPermiumStr!=null&&!totalPermiumStr.trim().equals("")) {
				totalPermiumNum=Double.parseDouble(totalPermiumStr);
			}
			policyInfo.setTotalPremium(totalPermiumNum);
			policyInfo.setNeedSms(basic.getNeedSMS());
			policyInfo.setTicketNo(basic.getTicketNo());
			policyInfo.setDepartureCity(basic.getDepartureCity());
			policyInfo.setDepartureDate(basic.getDepartureDate());
			policyInfo.setDepartureTime(basic.getDepartureTime());
			policyInfo.setArrivalCity(basic.getArrivalCity());
			policyInfo.setArrivalDate(basic.getArrivalDate());
			policyInfo.setArrivalTime(basic.getArrivalTime());
			policyInfo.setRelationApp(basic.getRelationApp());
			policyInfo.setRelationBen(basic.getRelationBen());
			policyInfo.setApplicantName(basic.getAccName());
			policyInfo.setApplicantType(s.getApplicant().getApplicantType());
			policyInfo.setApplicantNum(s.getApplicant().getApplicantNum());
			policyInfo.setApplicantSex(s.getApplicant().getApplicantSex());
			policyInfo.setAppBirthDate(s.getApplicant().getApplicantBirthDate());
			policyInfo.setApplicantAddress(s.getApplicant().getApplicantAddress());
			policyInfo.setApplicantPhone(s.getApplicant().getApplicantPhone());
			policyInfo.setInsuredName(s.getInsured().getInsuredName());
			policyInfo.setInsuredType(s.getInsured().getInsuredType());
			policyInfo.setInsuredNum(s.getInsured().getInsuredNum());
			policyInfo.setInsuredSex(s.getInsured().getInsuredSex());
			policyInfo.setInsuredBirthDate(respnese.getInsured().getInsuredBirthDate());
			insertSelective(policyInfo);
		}
	}


	@Override
	public ApplyResponse sendPolicyInfo(SaveParamsBean s) {
		XmlDeclarationXStream st=new XmlDeclarationXStream();
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
		String result=Transponder.sendPost(url, xml, true);
		st.processAnnotations(ApplyResponse.class);//启用注解
		ApplyResponse respnese = (ApplyResponse)st.fromXML(result);
		return respnese;
	}
	@Override
	public SaveParamsBean initParams(SaveParamsBean s,
			InsuredNode insured,BeneficiaryNode beneficiary,BasicNode basic
			,ApplicantNode applicant,@RequestParam Map<String,Object> map) {
		basic.setTransID(RandomTranUtil.getTrandNo());
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
		String idNum=insured.getInsuredNum();
		insured.setInsuredBirthDate(idNum.substring(6, 14));
		/**
		 * 测试数据,被保人信息
		 */

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
	return s;	
	}
}
