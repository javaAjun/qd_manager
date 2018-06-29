package com.palmble.qd_manager.resultBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Insured")
public class Insured {
	@XStreamAlias("Insured")
	private String InsuredName;
	
	@XStreamAlias("InsuredType")
	private String InsuredType;
	
	@XStreamAlias("InsuredNum")
	private String InsuredNum;
	
	@XStreamAlias("InsuredSex")
	private String InsuredSex;
	
	@XStreamAlias("InsuredBirthDate")
	private String InsuredBirthDate;
	public String getInsuredName() {
		return InsuredName;
	}
	public void setInsuredName(String insuredName) {
		InsuredName = insuredName;
	}
	public String getInsuredType() {
		return InsuredType;
	}
	public void setInsuredType(String insuredType) {
		InsuredType = insuredType;
	}
	public String getInsuredNum() {
		return InsuredNum;
	}
	public void setInsuredNum(String insuredNum) {
		InsuredNum = insuredNum;
	}
	public String getInsuredSex() {
		return InsuredSex;
	}
	public void setInsuredSex(String insuredSex) {
		InsuredSex = insuredSex;
	}
	public String getInsuredBirthDate() {
		return InsuredBirthDate;
	}
	public void setInsuredBirthDate(String insuredBirthDate) {
		InsuredBirthDate = insuredBirthDate;
	}
	
}
