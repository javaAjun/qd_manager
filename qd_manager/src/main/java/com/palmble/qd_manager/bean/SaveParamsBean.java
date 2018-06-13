package com.palmble.qd_manager.bean;

public class SaveParamsBean {
	private String ApplyRequest;
	private BasicNode Main;
	private InsuredNode Insured;
	private ApplicantNode Applicant;
	public String getApplyRequest() {
		return ApplyRequest;
	}
	public void setApplyRequest(String applyRequest) {
		ApplyRequest = applyRequest;
	}
	public BasicNode getMain() {
		return Main;
	}
	public void setMain(BasicNode main) {
		Main = main;
	}
	public InsuredNode getInsured() {
		return Insured;
	}
	public void setInsured(InsuredNode insured) {
		Insured = insured;
	}
	public ApplicantNode getApplicant() {
		return Applicant;
	}
	public void setApplicant(ApplicantNode applicant) {
		Applicant = applicant;
	}
	
}
