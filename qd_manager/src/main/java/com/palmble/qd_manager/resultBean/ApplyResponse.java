package com.palmble.qd_manager.resultBean;

import java.util.List;

//新华接口返回xml用dom4j转化为该的对象
public class ApplyResponse {
	private Main main;
	private ResultStatus resultStatus;
	private List<Insurances> Insurances;
	private Insured insured;
	private Applicant applicant;
	private Beneficiary beneficiary;
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public ResultStatus getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}
	public List<Insurances> getInsurances() {
		return Insurances;
	}
	public void setInsurances(List<Insurances> insurances) {
		Insurances = insurances;
	}
	public Insured getInsured() {
		return insured;
	}
	public void setInsured(Insured insured) {
		this.insured = insured;
	}
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
	
}
