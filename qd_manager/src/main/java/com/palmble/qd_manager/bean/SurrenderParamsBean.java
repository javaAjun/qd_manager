package com.palmble.qd_manager.bean;

/**
* <p>Title: 退单XML根节点实体类,该实体用于转换对象</p>  
* <p>Description:pamable </p>  
* @author WangYanke  
* @date 2018年6月27日 
* @version 1.0
 */
public class SurrenderParamsBean {
	private TransData TransData;

	
	
	
	public SurrenderParamsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SurrenderParamsBean(com.palmble.qd_manager.bean.TransData transData) {
		super();
		TransData = transData;
	}
	public TransData getTransData() {
		return TransData;
	}
	public void setTransData(TransData transData) {
		TransData = transData;
	}
	
	
	
}
