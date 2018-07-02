package com.palmble.qd_manager.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
* <p>Title: 退单XML根节点实体类,该实体用于转换对象</p>  
* <p>Description:pamable </p>  
* @author WangYanke  
* @date 2018年6月27日 
* @version 1.0
 */
@XStreamAlias("CancelRequest")
public class SurrenderParamsBean {
	@XStreamAlias("TransData")
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
