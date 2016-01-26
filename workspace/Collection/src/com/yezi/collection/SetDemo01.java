package com.yezi.collection;
/*
 * Set 称为有序列表是因为有Treeset这个子类
 * HashSet 散列存放
 * TreeSet是有序存放
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {

	public static void main(String[] args) {
		Set<String> s = null;
		s = new HashSet<String>();
		s.add("amy");
		s.add("bob");
		s.add("Canthy");
		s.add("aslan");
		s.add("erbin");
		s.add("jamy");
		System.out.println(s);
		/*
		 * 存放顺序为
		 * [jamy, bob, Canthy, aslan, amy, erbin]
		 */
		Set<Integer> num = null;
		num = new TreeSet<>();
		num.add(100);
		num.add(200);
		num.add(600);
		num.add(700);
		num.add(500);
		num.add(1300);
		System.out.println(num);
		/*
		 *  存放顺序为
		 *  [100, 200, 500, 600, 700, 1300]
		 */
	}

}
