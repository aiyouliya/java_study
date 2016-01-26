package com.yezi.test;

public class UiTest {

	public static void main(String[] args) {
//		System.out.println("hello yezi test");
//		say();
		add(10.1,20.2);
		add("hello"," java now.");
	}
	


	//reload жиди
	private static void add(double d, double e) {
		// TODO Auto-generated method stub
		System.out.println(d+e);
	}	
	
	public static void add(int i, int j){
		System.out.println(i+j);
	}
	public static void add(float i, float j){
		System.out.println(i+j);
	}
	public static void add(String i, String j){
		System.out.println(i+j);
	}
}
	
