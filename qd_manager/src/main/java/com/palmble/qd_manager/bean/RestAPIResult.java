package com.palmble.qd_manager.bean;

import java.io.Serializable;


/**
 * RestAPIResult2 <br/>
 * Function: REST API接口统一响应接口实体. <br/>
 * 
 */
public class RestAPIResult implements Serializable {

	/**
	 * serialVersionUID:
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//0成功 1失败
    private int respCode;

    private String respMsg;
    
    private String dataCode;
    
    private Object respData;

	public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

	public RestAPIResult(){
	}
 

	public String getDataCode() {
		return dataCode;
	}

	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

	public Object getRespData() {
		return respData;
	}

	public void setRespData(Object respData) {
		this.respData = respData;
	}

	
}
