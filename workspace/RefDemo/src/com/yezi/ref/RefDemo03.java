package com.yezi.ref;

class Ref2{
	String temp = "hello";
}

public class RefDemo03 {

	public static void main(String[] args) {
		Ref2 r1 = new Ref2();
		r1.temp = "jike";
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
		}
/*
 * 如果新建一个方法参数是类名，则引用传递后，值可以被修改。
 */
	public static void tell(Ref2 r2){
		r2.temp = "x";
	}
}
