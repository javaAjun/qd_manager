package com.palmble.qd_manager.bean;


public class TransData extends Node{
	private String TransID;
	private String SellFormType;
	private	PolicySet Insurances;
	private String TransDate;
	private String TransTime;
	private String Extend1;
	
	
	public TransData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicySet getInsurances() {
		return Insurances;
	}

	public void setInsurances(PolicySet insurances) {
		Insurances = insurances;
	}

	public String getTransID() {
		return TransID;
	}
	public void setTransID(String transID) {
		TransID = transID;
	}
	public String getSellFormType() {
		return SellFormType;
	}
	public void setSellFormType(String sellFormType) {
		SellFormType = sellFormType;
	}
	
	public String getTransDate() {
		return TransDate;
	}
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	public String getTransTime() {
		return TransTime;
	}
	public void setTransTime(String transTime) {
		TransTime = transTime;
	}
	public String getExtend1() {
		return Extend1;
	}
	public void setExtend1(String extend1) {
		Extend1 = extend1;
	}
	
	
}
