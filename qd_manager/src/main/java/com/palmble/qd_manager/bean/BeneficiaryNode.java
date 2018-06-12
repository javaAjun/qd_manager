package com.palmble.qd_manager.bean;

public class BeneficiaryNode extends Node{

	private String Beneficiary;
	private String BeneficiaryName;
	private String BeneficiaryType;
	private String BeneficiaryNum;
	public String getBeneficiary() {
		return Beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		Beneficiary = beneficiary;
	}
	public String getBeneficiaryName() {
		return BeneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		BeneficiaryName = beneficiaryName;
	}
	public String getBeneficiaryType() {
		return BeneficiaryType;
	}
	public void setBeneficiaryType(String beneficiaryType) {
		BeneficiaryType = beneficiaryType;
	}
	public String getBeneficiaryNum() {
		return BeneficiaryNum;
	}
	public void setBeneficiaryNum(String beneficiaryNum) {
		BeneficiaryNum = beneficiaryNum;
	}
	
}
