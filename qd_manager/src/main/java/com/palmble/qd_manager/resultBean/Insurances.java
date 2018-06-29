package com.palmble.qd_manager.resultBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Insurances")
public class Insurances {
	@XStreamAlias("InsuranceNo")
	private String InsuranceNo;
	
	@XStreamAlias("PolicyStatus")
	private String PolicyStatus;
	
	@XStreamAlias("IdentifyCode")
	private String IdentifyCode;
	


	public String getInsuranceNo() {
		return InsuranceNo;
	}
	public void setInsuranceNo(String insuranceNo) {
		InsuranceNo = insuranceNo;
	}
	public String getPolicyStatus() {
		return PolicyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		PolicyStatus = policyStatus;
	}
	public String getIdentifyCode() {
		return IdentifyCode;
	}
	public void setIdentifyCode(String identifyCode) {
		IdentifyCode = identifyCode;
	}
	
}
