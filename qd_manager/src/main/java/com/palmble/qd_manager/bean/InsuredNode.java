package com.palmble.qd_manager.bean;

public class InsuredNode{
	private String InsuredName;//被保人姓名
	private String InsuredType;//被保人证件类型 0--身份证;1--护照;2--军官证;3--驾照;4--出生证明;5--户口簿; 9--数据转换证件;b--港澳台居民内地通行证 
	private String InsuredNum;//被保人证件号码
	private Integer InsuredSex;//被保人性别
	private String InsuredBirthDate;//被保人生日

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
	public Integer getInsuredSex() {
		return InsuredSex;
	}
	public void setInsuredSex(Integer insuredSex) {
		InsuredSex = insuredSex;
	}
	public String getInsuredBirthDate() {
		return InsuredBirthDate;
	}
	public void setInsuredBirthDate(String insuredBirthDate) {
		InsuredBirthDate = insuredBirthDate;
	}
	
}
