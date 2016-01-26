package com.yezi.classDemon04;
/*
 * 匿名调用
 */
class Student{
	public void tell(){
	System.out.println("hello yezi");
}
}

public class ClassDemon05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		匿名调用，不用先声明再实例化
		new Student().tell();
		
	}

}
