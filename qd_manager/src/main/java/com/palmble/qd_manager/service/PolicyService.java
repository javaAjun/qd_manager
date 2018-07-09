package com.palmble.qd_manager.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.palmble.qd_manager.bean.ApplicantNode;
import com.palmble.qd_manager.bean.BasicNode;
import com.palmble.qd_manager.bean.BeneficiaryNode;
import com.palmble.qd_manager.bean.InsuredNode;
import com.palmble.qd_manager.bean.SaveParamsBean;
import com.palmble.qd_manager.model.PolicyInfo;
import com.palmble.qd_manager.resultBean.ApplyResponse;

public interface PolicyService {
	PolicyInfo selectByPrimaryKey(Long id);
    int deleteByPrimaryKey(Long id);

    int insert(PolicyInfo record);

    int insertSelective(PolicyInfo record);

    int updateByPrimaryKeySelective(PolicyInfo record);

    int updateByPrimaryKey(PolicyInfo record);
	List<PolicyInfo> getByUserId(Long userId);
	
	ApplyResponse sendPolicyInfo(SaveParamsBean s);
	public void save(SaveParamsBean s,ApplyResponse respnese);
	public SaveParamsBean initParams(SaveParamsBean s,
			InsuredNode insured,BeneficiaryNode beneficiary,BasicNode basic
			,ApplicantNode applicant,@RequestParam Map<String,Object> map);
}
