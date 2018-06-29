package com.palmble.qd_manager.bean;

/**
* <p>Title: 保单查询参数转换XML实体</p>  
* <p>Description:pamable </p>  
* @author WangYanke  
* @date 2018年6月26日 
* @version 1.0
 */
public class SearchParamsBean {
	private String ApplyResponse;
	private SearchNode Main;
	private Node node;
	
	
	public SearchParamsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchParamsBean(String applyResponse, SearchNode main, Node node) {
		super();
		ApplyResponse = applyResponse;
		Main = main;
		this.node = node;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public String getApplyResponse() {
		return ApplyResponse;
	}
	public void setApplyResponse(String applyResponse) {
		ApplyResponse = applyResponse;
	}
	public SearchNode getMain() {
		return Main;
	}
	public void setMain(SearchNode main) {
		Main = main;
	}


	
	
}
