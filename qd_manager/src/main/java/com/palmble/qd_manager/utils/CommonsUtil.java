package com.palmble.qd_manager.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CommonsUtil {
	public static Map<String,Object> objsToMap(Object[] objs) throws Exception {
		Map<String,Object> map=new HashMap<String,Object>();
		for(Object o:objs) {
			Class<?> clazz=o.getClass();
			Field[] resField=clazz.getDeclaredFields();
			for(Field field:resField) {
				String name=field.getName();
				name = name.substring(0, 1).toUpperCase()
						+ name.substring(1);
				Method m = clazz.getMethod("get" + name);
				map.put(field.getName(), m.invoke(o));
			}
		}
		return map;
	}
}
