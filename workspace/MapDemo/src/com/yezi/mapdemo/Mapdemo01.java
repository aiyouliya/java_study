package com.yezi.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdemo01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "jamy");	//通过put()方法向map表中添加数据
		map.put("age", "16");
		map.put("hight", "178");
		map.put("weight", "68");
		map.put("EDU", "MID_school");
		map.put("next_edu", "High_school");
		if (map.containsKey("name")) {	//通过判断键是否存在map表中
			System.out.println(map+"\n");
		} else {
			System.out.println("name is not content in the map!\n");
		}
		if (map.containsValue("jamy")) {	//	通过值判断是否存在map表中
			System.out.println("jamy is right!");
		} else {
			System.out.println("there is no value in the map!");
		}
		/*
		 * 获取所有的键，通过map.keySet()方法
		 */
		Set<String> s = map.keySet();	//定义一个Set存储key值
		Iterator<String> iter = s.iterator(); 	//通过迭代器输出key值
		while (iter.hasNext()) {
			System.out.println("key value is: "+iter.next()); 	//打印key值 
		}
		
	}

}
