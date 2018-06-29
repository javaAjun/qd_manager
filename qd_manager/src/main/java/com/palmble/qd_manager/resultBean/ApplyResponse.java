package com.palmble.qd_manager.resultBean;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.thoughtworks.xstream.annotations.XStreamAlias;


//新华接口返回xml用dom4j转化为该的对象
@XStreamAlias("ApplyResponse")
public class ApplyResponse {
	@XStreamAlias("ResultStatus")
	private ResultStatus resultStatus;
	
	@XStreamAlias("Main")
	private Main main;
	
	@XStreamAlias("Insured")
	private Insured insured;
	
	@XStreamAlias("Applicant")
	private Applicant applicant;
	
	@XStreamAlias("Beneficiary")
	private Beneficiary beneficiary;
	
	
	
	public ResultStatus getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
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
	@Override
	public String toString() {
		return "ApplyResponse [resultStatus=" + resultStatus + ", main=" + main + ", insured=" + insured
				+ ", applicant=" + applicant + ", beneficiary=" + beneficiary + "]";
	}
	
	
}
