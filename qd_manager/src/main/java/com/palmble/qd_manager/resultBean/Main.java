package com.palmble.qd_manager.resultBean;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicitCollection;

@XStreamAlias("Main")
@XStreamImplicitCollection("insurances")
public class Main {
	@XStreamAlias("Insurances")
	private List<Insurances> insurances;
	
	@XStreamAlias("TransID")
	private String TransID;
	
	@XStreamAlias("EffectDate")
	private String EffectDate;
	
	@XStreamAlias("ExpiryDate")
	private String ExpiryDate;
	
	
	@XStreamAlias("EpolicyInfo")
	private String EpolicyInfo;
	
	@XStreamAlias("PlanCode")
	private String PlanCode;
	
	@XStreamAlias("Amount")
	private Double Amount;
	
	@XStreamAlias("RelationApp")
	private String RelationApp;
	
	@XStreamAlias("Premium")
	private Double Premium;
	
	@XStreamAlias("TransDate")
	private String TransDate;
	
	@XStreamAlias("TicketNo")
	private String TicketNo;
	
	@XStreamAlias("ApplicantPhone")
	private String ApplicantPhone;
	
	@XStreamAlias("ApplicantAddress")
	private String ApplicantAddress;
	
	@XStreamAlias("TotalPremium")
	private Double TotalPremium;
	
	@XStreamAlias("RelationBen")
	private String RelationBen;
	
	
	
	public String getTransDate() {
		return TransDate;
	}
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	public String getTicketNo() {
		return TicketNo;
	}
	public void setTicketNo(String ticketNo) {
		TicketNo = ticketNo;
	}
	public String getApplicantPhone() {
		return ApplicantPhone;
	}
	public void setApplicantPhone(String applicantPhone) {
		ApplicantPhone = applicantPhone;
	}
	public String getApplicantAddress() {
		return ApplicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		ApplicantAddress = applicantAddress;
	}
	public Double getTotalPremium() {
		return TotalPremium;
	}
	public void setTotalPremium(Double totalPremium) {
		TotalPremium = totalPremium;
	}
	public String getRelationBen() {
		return RelationBen;
	}
	public void setRelationBen(String relationBen) {
		RelationBen = relationBen;
	}
	public String getRelationApp() {
		return RelationApp;
	}
	public void setRelationApp(String relationApp) {
		RelationApp = relationApp;
	}
	public Double getPremium() {
		return Premium;
	}
	public void setPremium(Double premium) {
		Premium = premium;
	}
	public List<Insurances> getInsurances() {
		return insurances;
	}
	public void setInsurances(List<Insurances> insurances) {
		this.insurances = insurances;
	}
	public String getTransID() {
		return TransID;
	}
	public void setTransID(String transID) {
		TransID = transID;
	}
	public String getEffectDate() {
		return EffectDate;
	}
	public void setEffectDate(String effectDate) {
		EffectDate = effectDate;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public String getEpolicyInfo() {
		return EpolicyInfo;
	}
	public void setEpolicyInfo(String epolicyInfo) {
		EpolicyInfo = epolicyInfo;
	}
	public String getPlanCode() {
		return PlanCode;
	}
	public void setPlanCode(String planCode) {
		PlanCode = planCode;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Main [insurances=" + insurances + ", TransID=" + TransID + ", EffectDate=" + EffectDate
				+ ", ExpiryDate=" + ExpiryDate + ", EpolicyInfo=" + EpolicyInfo + ", PlanCode=" + PlanCode + ", Amount="
				+ Amount + ", RelationApp=" + RelationApp + ", Premium=" + Premium + ", TotalPremium=" + TotalPremium
				+ ", RelationBen=" + RelationBen + "]";
	}
	
}
