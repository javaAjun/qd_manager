package com.palmble.qd_manager.resultBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Applicant")
public class Applicant {
	@XStreamAlias("ApplicantName")
	private String ApplicantName;
	
	@XStreamAlias("ApplicantType")
	private String ApplicantType;
	
	@XStreamAlias("ApplicantNum")
	private String ApplicantNum;
	
	@XStreamAlias("ApplicantSex")
	private String ApplicantSex;
	
	@XStreamAlias("ApplicantBirthDate")
	private String ApplicantBirthDate;
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
}
