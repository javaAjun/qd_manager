package com.palmble.qd_manager.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palmble.qd_manager.xhpos.StandardPolicyPortType;
@RestController
public class TestController {
	@Autowired
	private StandardPolicyPortType standardPolicyPortType;
	
	/**
	 * <p>Title: 投保接口</p>   
	 * @author WangYanke  
	 * @date 2018年6月28日
	 */
	@PostMapping("/test1")
	public String test1(HttpServletRequest request) {
		String xml=(String) request.getParameter("xml"); 
		String result=standardPolicyPortType.insure(xml);
		return result;
	}
	
	/**
	 * <p>Title:获取保单详情接口</p>   
	 * @author WangYanke  
	 * @date 2018年6月28日
	 */
	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {
		 String xml=(String) request.getParameter("xml"); 
		 String result=standardPolicyPortType.search(xml);
		return result;
	}
	
	/**
	 * <p>Title: 退保接口调用</p>   
	 * @author WangYanke  
	 * @date 2018年6月28日
	 */
	@PostMapping("/surrender")
	public String surrender(HttpServletRequest request) {
		 String xml=(String) request.getParameter("xml"); 
		 String result=standardPolicyPortType.surrender(xml);
		return result;
	}
	
	/**
	 * <p>Title: 获取产品信息</p>   
	 * @author WangYanke  
	 * @date 2018年6月28日
	 */
	@PostMapping("/searchProductInfo")
	public String searchProductInfo(HttpServletRequest request) {
		 String xml=(String) request.getParameter("xml"); 
		 String result=standardPolicyPortType.searchProductInfo(xml);
		return result;
	}
}