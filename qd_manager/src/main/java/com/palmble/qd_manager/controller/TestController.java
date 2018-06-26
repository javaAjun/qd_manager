package com.palmble.qd_manager.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
//	@Autowired
//	private StandardPolicyPortType standardPolicyPortType;
//	@PostMapping("/test1")
//	public String test1(HttpServletRequest request) {
//		String xml=(String) request.getParameter("xml"); 
//		String result=standardPolicyPortType.insure(xml);
//		return result;
//	}
	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {
		 String xml=(String) request.getParameter("xml"); 
		return xml;
	}
}