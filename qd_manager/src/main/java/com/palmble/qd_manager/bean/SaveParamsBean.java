package com.palmble.qd_manager.bean;

public class SaveParamsBean {
	private String ApplyRequest;
	private BasicNode Main;
	private InsuredNode Insured;
	private ApplicantNode Applicant;
	private BeneficiaryNode Beneficiary;
	private Node node;
	
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public BeneficiaryNode getBeneficiary() {
		return Beneficiary;
	}
	public void setBeneficiary(BeneficiaryNode beneficiary) {
		Beneficiary = beneficiary;
	}
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
