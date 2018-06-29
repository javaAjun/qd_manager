package com.palmble.qd_manager.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
* <p>Title: 提交保单XML实体(对应根节点ApplyRequest)</p>  
* <p>Description:pamable </p>  
* @author WangYanke  
* @date 2018年6月27日 
* @version 1.0
 */
@XStreamAlias("ApplyRequest")
public class SaveParamsBean {
	@XStreamAlias("Main")
	private BasicNode Main;//基本交易节点
	@XStreamAlias("Insured")
	private InsuredNode Insured;//被保人信息节点
	@XStreamAlias("Applicant")
	private ApplicantNode Applicant;//投保人信息节点
	@XStreamAlias("Beneficiary")
	private BeneficiaryNode Beneficiary;//受益人信息节点 如果投保人与被保人为同一人可以无此节点

	public BeneficiaryNode getBeneficiary() {
		return Beneficiary;
	}
	public void setBeneficiary(BeneficiaryNode beneficiary) {
		Beneficiary = beneficiary;
	}

	public BasicNode getMain() {
		return Main;
	}
	public void setMain(BasicNode main) {
		Main = main;
	}
	public InsuredNode getInsured() {
		return Insured;
	}
	public void setInsured(InsuredNode insured) {
		Insured = insured;
	}
	public ApplicantNode getApplicant() {
		return Applicant;
	}
	public void setApplicant(ApplicantNode applicant) {
		Applicant = applicant;
	}
	
}
