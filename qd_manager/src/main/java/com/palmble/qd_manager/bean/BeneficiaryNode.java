package com.palmble.qd_manager.bean;

public class BeneficiaryNode extends Node{

	private String BeneficiaryName;//受益人姓名
	private String BeneficiaryType;//受益人证件类型
	private String BeneficiaryNum;//受益人证件号码
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
