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
	private String Amount;
	
	@XStreamAlias("RelationApp")
	private String RelationApp;
	
	@XStreamAlias("Premium")
	private String Premium;
	
	@XStreamAlias("TotalPremium")
	private String TotalPremium;
	
	@XStreamAlias("RelationBen")
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
	@Override
	public String toString() {
		return "Main [insurances=" + insurances + ", TransID=" + TransID + ", EffectDate=" + EffectDate
				+ ", ExpiryDate=" + ExpiryDate + ", EpolicyInfo=" + EpolicyInfo + ", PlanCode=" + PlanCode + ", Amount="
				+ Amount + ", RelationApp=" + RelationApp + ", Premium=" + Premium + ", TotalPremium=" + TotalPremium
				+ ", RelationBen=" + RelationBen + "]";
	}
	
}
