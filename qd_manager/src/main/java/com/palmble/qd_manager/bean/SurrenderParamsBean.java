package com.palmble.qd_manager.bean;

public class SurrenderParamsBean {
	private String CancelRequest;//根节点
	private TransData TransData;
	
	
	public SurrenderParamsBean(String cancelRequest, com.palmble.qd_manager.bean.TransData transData) {
		super();
		CancelRequest = cancelRequest;
		TransData = transData;
	}
	public SurrenderParamsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCancelRequest() {
		return CancelRequest;
	}
	public void setCancelRequest(String cancelRequest) {
		CancelRequest = cancelRequest;
	}
	public TransData getTransData() {
		return TransData;
	}
	public void setTransData(TransData transData) {
		TransData = transData;
	}
	
	
	
}
