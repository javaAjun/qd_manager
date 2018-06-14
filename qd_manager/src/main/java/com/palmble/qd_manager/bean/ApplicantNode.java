package com.palmble.qd_manager.bean;

public class ApplicantNode extends Node{
	private String Applicant;//投保人信息节点
	private String ApplicantName;//投保人姓名
	private String ApplicantType;//投保人证件类型 0--身份证;1--护照;2--军官证;3--驾照;4--出生证明;5--户口簿; 9--数据转换证件;b--港澳台居民内地通行证
	private String ApplicantNum;//投保人证件号码
	private String ApplicantSex;//投保人性别
	private String ApplicantBirthDate;//投保人出生日期
	private String ApplicantAddress;//投保人地址
	private String ApplicantPhone;//投保人联系电话
	public String getApplicant() {
		return Applicant;
	}
	public void setApplicant(String applicant) {
		Applicant = applicant;
	}
	public String getApplicantName() {
		return ApplicantName;
	}
	public void setApplicantName(String applicantName) {
		ApplicantName = applicantName;
	}
	public String getApplicantType() {
		return ApplicantType;
	}
	public void setApplicantType(String applicantType) {
		ApplicantType = applicantType;
	}
	public String getApplicantNum() {
		return ApplicantNum;
	}
	public void setApplicantNum(String applicantNum) {
		ApplicantNum = applicantNum;
	}
	public String getApplicantSex() {
		return ApplicantSex;
	}
	public void setApplicantSex(String applicantSex) {
		ApplicantSex = applicantSex;
	}
	public String getApplicantBirthDate() {
		return ApplicantBirthDate;
	}
	public void setApplicantBirthDate(String applicantBirthDate) {
		ApplicantBirthDate = applicantBirthDate;
	}
	public String getApplicantAddress() {
		return ApplicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		ApplicantAddress = applicantAddress;
	}
	public String getApplicantPhone() {
		return ApplicantPhone;
	}
	public void setApplicantPhone(String applicantPhone) {
		ApplicantPhone = applicantPhone;
	}
}
