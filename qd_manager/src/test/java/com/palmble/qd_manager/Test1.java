package com.palmble.qd_manager;

import org.junit.Test;

import com.palmble.qd_manager.bean.ApplicantNode;
import com.palmble.qd_manager.bean.BasicNode;
import com.palmble.qd_manager.bean.SaveParamsBean;
import com.palmble.qd_manager.utils.XmlUtil;

public class Test1 {

	@Test
	public void test1() {
		SaveParamsBean a=new SaveParamsBean();
		BasicNode b=new BasicNode();
		b.setAccName("accName");
		b.setArrivalCity("city");
		b.setArrivalDate("date");
		ApplicantNode applicantNode=new ApplicantNode();
		applicantNode.setApplicant("appcat");
		applicantNode.setApplicantAddress("address");
		a.setMain(b);
		a.setApplicant(applicantNode);
		System.out.println(XmlUtil.getXmlString(a));
	}
}
