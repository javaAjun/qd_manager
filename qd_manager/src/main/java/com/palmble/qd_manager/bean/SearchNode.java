package com.palmble.qd_manager.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ApplyResponse")
public class SearchNode {
	@XStreamAlias("Main")
	private SearchMain Main;

	public SearchMain getMain() {
		return Main;
	}

	public void setMain(SearchMain main) {
		Main = main;
	}

	
	
}
