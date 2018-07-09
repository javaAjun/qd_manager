package com.palmble.qd_manager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.palmble.qd_manager.bean.ApplicantNode;
import com.palmble.qd_manager.bean.BasicNode;
import com.palmble.qd_manager.bean.SaveParamsBean;
import com.palmble.qd_manager.utils.ValidateUtil;

public class Test1 {

	@Test
	public void test1() {
		SaveParamsBean a = new SaveParamsBean();
		BasicNode b = new BasicNode();
		b.setAccName("accName");
		b.setArrivalCity("city");
		b.setArrivalDate("date");
		ApplicantNode applicantNode = new ApplicantNode();
		//applicantNode.setApplicant("appcat");
		applicantNode.setApplicantAddress("address");
		a.setMain(b);
		a.setApplicant(applicantNode);
		System.out.println(ValidateUtil.CardNoValidate(""));//验证身份证
		System.out.println(ValidateUtil.validateBirthdayOrCardNo("19900611","41032519900611107X"));//验证生日与身份证生日是否相同
		System.out.println();
	}

	@Test
	public void test2() {
			String orderNo = "" ;
			String trandNo = String.valueOf((Math.random() * 9 + 1) * 1000000); 
			String sdf = new SimpleDateFormat("yyMMddHHMMSS").format(new Date()); 
			orderNo = trandNo.toString().substring(0, 6); 
			orderNo = orderNo + sdf ; 
			System.out.println(orderNo);
			return; 
			}
	public static void main(String[] args) {
		SimpleDateFormat daf=new SimpleDateFormat("YYYYMMdd");
		String projectNo="P"+daf.format(new Date())+"009";
		System.out.println(projectNo.substring(9, 12));
		int num = Integer.parseInt(projectNo.substring(9, 12));
		num++;
		System.out.println(num);
		if(num<10) {
			projectNo="P"+daf.format(new Date())+"00"+num;
		}else if (num<100) {
			projectNo="P"+daf.format(new Date())+"0"+num;
		}
		System.out.println(String.valueOf(projectNo));
	}
	
}
