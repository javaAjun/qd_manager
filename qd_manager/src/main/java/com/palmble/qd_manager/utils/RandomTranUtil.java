package com.palmble.qd_manager.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomTranUtil {
	public static String getTrandNo() {
		String orderNo = "" ;
		String trandNo = String.valueOf((Math.random() * 9 + 1) * 1000000); 
		String sdf = new SimpleDateFormat("yyMMddHHMMSS").format(new Date()); 
		orderNo = trandNo.toString().substring(0, 6); 
		orderNo = orderNo + sdf ; 
		return orderNo; 
		}
}
