package com.palmble.qd_manager.bean;

import java.util.List;

public class PolicySet extends Node{
	private List<String> InsuranceNo;

	
	
	public PolicySet() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PolicySet(List<String> insuranceNo) {
		super();
		InsuranceNo = insuranceNo;
	}



	public List<String> getInsuranceNo() {
		return InsuranceNo;
	}



	public void setInsuranceNo(List<String> insuranceNo) {
		InsuranceNo = insuranceNo;
	}

	
	
	
}	
