package com.palmble.qd_manager.bean;

public class SearchParamsBean {
	private String InsuranceNo; //保单号
	private String TransSignature; //交易签名  MD5（密钥＋报文整个主体内容），注：报文未采用加密方式，不用处理
	
	
	
	public SearchParamsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchParamsBean(String insuranceNo, String transSignature) {
		super();
		InsuranceNo = insuranceNo;
		TransSignature = transSignature;
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
