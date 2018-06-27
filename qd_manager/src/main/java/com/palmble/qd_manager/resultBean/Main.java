package com.palmble.qd_manager.resultBean;

import java.util.List;

public class Main {
	private List<Insurances> insurances;
	private String TransID;
	private String EffectDate;
	private String ExpiryDate;
	private String InsuranceNo;
	private String EpolicyInfo;
	private String PlanCode;
	private String Amount;
	private String RelationApp;
	private String Premium;
	private String TotalPremium;
	private String RelationBen;
	
	public String getTotalPremium() {
		return TotalPremium;
	}
	public void setTotalPremium(String totalPremium) {
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
	public String getPremium() {
		return Premium;
	}
	public void setPremium(String premium) {
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
	public String getInsuranceNo() {
		return InsuranceNo;
	}
	public void setInsuranceNo(String insuranceNo) {
		InsuranceNo = insuranceNo;
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
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	
}
