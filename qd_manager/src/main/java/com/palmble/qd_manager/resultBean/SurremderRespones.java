package com.palmble.qd_manager.resultBean;

import com.palmble.qd_manager.bean.TransData;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("CancelResponse")
public class SurremderRespones {
	@XStreamAlias("Main")
	private TransData TransData;
	
	@XStreamAlias("TransSignature")
	private String TransSignature;

	public TransData getTransData() {
		return TransData;
	}

	public void setTransData(TransData transData) {
		TransData = transData;
	}

	public String getTransSignature() {
		return TransSignature;
	}

	public void setTransSignature(String transSignature) {
		TransSignature = transSignature;
	}
	
	
}
