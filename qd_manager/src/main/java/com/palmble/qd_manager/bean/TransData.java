package com.palmble.qd_manager.bean;

import java.util.List;

import com.palmble.qd_manager.resultBean.Insurances;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Main")
public class TransData{
	
	@XStreamAlias("TransID")
	private String TransID;
	
	@XStreamAlias("SellFormType")
	private String SellFormType;
	
	@XStreamAlias("Insurances")
	private List<Insurances> insurances;
	
	@XStreamAlias("TransDate")
	private String TransDate;
	
	@XStreamAlias("TransTime")
	private String TransTime;
	
	@XStreamAlias("Extend1")
	private String Extend1;
	
	@XStreamAlias("ResultCode")
	private String ResultCode;
	
	@XStreamAlias("ResultMsg")
	private String ResultMsg;
	
	
	
	


	public String getResultCode() {
		return ResultCode;
	}
	public void setResultCode(String resultCode) {
		ResultCode = resultCode;
	}
	public String getResultMsg() {
		return ResultMsg;
	}
	public void setResultMsg(String resultMsg) {
		ResultMsg = resultMsg;
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
