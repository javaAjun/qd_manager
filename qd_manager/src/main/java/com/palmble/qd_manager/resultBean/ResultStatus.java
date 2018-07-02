package com.palmble.qd_manager.resultBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("ResultStatus")
public class ResultStatus {
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
	@Override
	public String toString() {
		return "ResultStatus [ResultCode=" + ResultCode + ", ResultMsg=" + ResultMsg + "]";
	}
	
	
}
