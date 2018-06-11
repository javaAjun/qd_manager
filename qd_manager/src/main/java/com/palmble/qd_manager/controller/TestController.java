package com.palmble.qd_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palmble.qd_manager.xhpos.StandardPolicyPortType;
@RestController
public class TestController {
	@Autowired
	private StandardPolicyPortType standardPolicyPortType;
	@PostMapping("/test1")
	public String test1(String xml) {
		String result=standardPolicyPortType.insure(xml);
		return result;
	}
	@PostMapping("/test2")
	public String test2(String xml) {
		return "success";
	}
}
