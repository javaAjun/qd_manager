package com.palmble.qd_manager.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Main")
public class SearchMain {
	@XStreamAlias("InsuranceNo")
	private String InsuranceNo; //保单号
	
	@XStreamAlias("TransSignature")
	private String TransSignature; //交易签名  MD5（密钥＋报文整个主体内容），注：报文未采用加密方式，不用处理
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
