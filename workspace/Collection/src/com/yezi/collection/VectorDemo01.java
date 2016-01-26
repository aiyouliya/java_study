package com.yezi.collection;
/*
 * List与Vector使用完全一致。
 * List性能高，非线程安全
 * Vector 性能差，线程安全
 */
import java.util.Vector;
import java.util.List;

public class VectorDemo01 {

	public static void main(String[] args) {
		List<String> list02 = new Vector<>();
		list02.add("hello");
		list02.add("world");
		for (int i = 0; i < list02.size(); i++) {
			System.out.println(list02.get(i));
		}
		
	}

}
