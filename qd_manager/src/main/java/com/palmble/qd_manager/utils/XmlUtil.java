package com.palmble.qd_manager.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.palmble.qd_manager.bean.Node;
import com.thoughtworks.xstream.XStream;


public class XmlUtil {
	public static Object getObject(Document document,Class<?> clazz) {
		Object obj=null;
		     //获取根节点
		Element root = document.getRootElement();
		try {
		obj=clazz.newInstance();//创建对象
		List<Element> properties=root.elements();
		for(Element pro:properties){
		//获取属性名(首字母大写)
		String propertyname=pro.getName();
		String propertyvalue=pro.getText();
		Method m = obj.getClass().getMethod("set"+propertyname,String.class);
		m.invoke(obj,propertyvalue);
		}

		} catch (Exception e) {
		e.printStackTrace();
		}
		return obj;
		}
		/**
		* xml字符串转对象
		* @param xmlString  
		* @param clazz
		* @return
		 * @throws Exception 
		*/
		public static Object getObject(String xmlString,Class<?> clazz) throws Exception {
		Document document=null;
		try {
		document = DocumentHelper.parseText(xmlString);
		} catch (DocumentException e) {
		throw new Exception("获取Document异常"+xmlString);
		}      //获取根节点
		return getObject(document,clazz);
		}
		/**
		* 对象转xml文件
		* @param b
		* @return
		*/
		public static Document getDocument(Object b) {
		Document document = DocumentHelper.createDocument();
		try {
		Field[] field = b.getClass().getDeclaredFields(); // 获取实体类b的所有属性，返回Field数组
		// 创建根节点元素
		Element root = document.addElement(field[0].getName());
		for (int j = 1; j < field.length; j++) { // 遍历所有有属性
		String name = field[j].getName(); // 获取属属性的名字
		if (!name.equals("serialVersionUID")) {//去除串行化序列属性
			name = name.substring(0, 1).toUpperCase()
			+ name.substring(1); // 将属性的首字符大写，方便构造get，set方法
			
			Method m = b.getClass().getMethod("get" + name);
			// System.out.println("属性get方法返回值类型:" + m.getReturnType());
//			System.out.println(m.invoke(b) instanceof Node);
			if(m.invoke(b) instanceof Node) {
				Field[] nodeField = m.invoke(b).getClass().getDeclaredFields();
				Element nodeRoot = root.addElement(nodeField[0].getName());
				//nodeField[0].getName()
				Node node=(Node)m.invoke(b);
				for (int i = 1; i < nodeField.length; i++) {
					String nodeName = nodeField[i].getName();
					if (!nodeName.equals("serialVersionUID")) {//去除串行化序列属性
						nodeName = nodeName.substring(0, 1).toUpperCase()
						+ nodeName.substring(1); // 将属性的首字符大写，方便构造get，set方法
						Method nm = m.invoke(b).getClass().getMethod("get" + nodeName);
						// System.out.println("属性get方法返回值类型:" + m.getReturnType());
//						System.out.println(m.invoke(b) instanceof Node);
						String Nodepropertievalue = (String)nm.invoke(node);// 获取属性值
						if(Nodepropertievalue!=null) {
							Element propertie = nodeRoot.addElement(nodeName);
							propertie.setText(Nodepropertievalue);
						}
					}
				}
			}else {
				String propertievalue = (String)m.invoke(b);// 获取属性值
				if(propertievalue!=null) {
					Element propertie = root.addElement(name);
					propertie.setText(propertievalue);
				}
			}
		}
		}


		} catch (Exception e) {
		e.printStackTrace();


		}

		return document;
		}

		/**
		* 对象转xml格式的字符串
		* @param b
		* @return
		*/
		    public static String getXmlString(Object b){
		    return getDocument(b).asXML();
		    }
		    public static <T> T xmlToObj(String xml,Class<?> clazz){
		    	XStream xstream = new XStream();
			    return null;
			    }
}
