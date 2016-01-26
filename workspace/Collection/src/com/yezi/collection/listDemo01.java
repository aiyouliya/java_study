package com.yezi.collection;
/*
 * List 是继承Collection接口
 * 使用前先导入引用的包
 */
import java.util.ArrayList;
import java.util.List;

public class listDemo01 {

	public static void main(String[] args) {
		List<String> list01 = null;	//list是个接口，所以不能直接实例化，需要在子类中实现实例化
		list01 = new ArrayList<String>();		//创建一个子类，并进行实例化。
		list01.add("yezi");				//ArrayList的API add 实现对list添加元素
		list01.add("jamy");
		list01.add("yiha");
		
		for (int i = 0; i < list01.size(); i++) {		//ArrayList.size()实现对list元素个数统计，返回整型
			System.out.println(list01.get(i));			//ArrayList.get(index)实现对第index个元素进行取值
		}
		list01.remove(0);						//ArrayList.remove(index)删除第index个元素。
		
		System.out.println("删除之后-------");
		for (int i = 0; i < list01.size(); i++) {
			System.out.println(i);
		}
		System.out.println("集合是否为空"+list01.isEmpty());		//ArrayList.isEmpty()判断列表是否为空，返回布尔值
		System.out.println("查找jamy是否在列表中："+ list01.indexOf("jamy"));	//判断列表中是否有"jamy"这个元素，如果有返回0，如果没有，返回 -1
	}

}
