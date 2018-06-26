package com.palmble.qd_manager.bean;

public class SearchNode extends Node{
	private String Main;
	private String InsuranceNo; //保单号
	private String TransSignature; //交易签名  MD5（密钥＋报文整个主体内容），注：报文未采用加密方式，不用处理
	
	

	public SearchNode() {
		super();
	}
	public SearchNode(String main, String insuranceNo, String transSignature) {
		super();
		Main = main;
		InsuranceNo = insuranceNo;
		TransSignature = transSignature;
	}
	public String getMain() {
		return Main;
	}
	public void setMain(String main) {
		Main = main;
	}
	public String getInsuranceNo() {
		return InsuranceNo;
	}
	public void setInsuranceNo(String insuranceNo) {
		InsuranceNo = insuranceNo;
	}
	public String getTransSignature() {
		return TransSignature;
	}
	public void setTransSignature(String transSignature) {
		TransSignature = transSignature;
	}
	
	
}
