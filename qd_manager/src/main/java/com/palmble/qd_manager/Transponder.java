package com.palmble.qd_manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
public class Transponder {
	public static String send(String soapXML) throws IOException {  
		 URL url = new URL("http://180.76.98.239:8888/test1");  
	        //2：打开到服务地址的一个连接  
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();  
	        //3：设置连接参数  
	        //3.1设置发送方式：POST必须大写  
	        connection.setRequestMethod("POST");  
	        //3.2设置数据格式：Content-type  
	        connection.setRequestProperty("content-type", "text/xml;charset=utf-8");  
	        //3.3设置输入输出，新创建的connection默认是没有读写权限的，  
	        connection.setDoInput(true);  
	        connection.setDoOutput(true);  
	  
	        //4：组织SOAP协议数据，发送给服务端  
	        OutputStream os = connection.getOutputStream();  
	        os.write(soapXML.getBytes());  
	          
	        //5：接收服务端的响应  
	        int responseCode = connection.getResponseCode();  
	        StringBuilder sb=null;
	        if(200 == responseCode){//表示服务端响应成功  
	            InputStream is = connection.getInputStream();  
	            InputStreamReader isr = new InputStreamReader(is);  
	            BufferedReader br = new BufferedReader(isr);  
	              
	            sb = new StringBuilder();  
	            String temp = null;  
	              
	            while(null != (temp = br.readLine())){  
	                sb.append(temp);  
	            }
	              
	              
	            is.close();  
	            isr.close();  
	            br.close();  
	        }else {
            	sb = new StringBuilder(""); 
            	sb.append("responseCode"+responseCode+"msg:"+connection.getResponseMessage());
            }  
	  
	        os.close();  
	        return sb.toString();
	    }  
}
