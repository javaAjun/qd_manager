package com.palmble.qd_manager.resultBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Beneficiary")
public class Beneficiary {
	
	@XStreamAlias("beneficiaryName")
	private String beneficiaryName;
	
	@XStreamAlias("BeneficiaryType")
	private String BeneficiaryType;
	
	@XStreamAlias("BeneficiaryNum")
	private String BeneficiaryNum;
	
	
	
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
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
	@Override
	public String toString() {
		return "Beneficiary [beneficiaryName=" + beneficiaryName + ", BeneficiaryType=" + BeneficiaryType
				+ ", BeneficiaryNum=" + BeneficiaryNum + "]";
	}
}
