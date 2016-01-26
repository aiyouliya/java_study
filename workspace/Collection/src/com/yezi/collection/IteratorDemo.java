package com.yezi.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> list02 = new ArrayList<String>();
		list02.add("A");
		list02.add("B");
		list02.add("C");
		list02.add("D");
		list02.add("E");
		list02.add("F");
		
	Iterator<String> iter = list02.iterator();//迭代可以通过collection接口的子类直接定义
	while (iter.hasNext()) {
		String str = iter.next();
		if ("A".equals(str)) {
			iter.remove();//使用迭代器删除满足条件中的元素
			
		}else{
			/*
			 * 在迭代输出的同时，不可以通过集合删除元素，否则会报错，编译可以通过 
			 */
//			list02.remove(2);	//此处如果通过集合删除元素，会报错，编译通过
			System.out.println(str);
		}
		
	}
		
	}

}
