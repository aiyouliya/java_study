package com.yezi.classdemo;

class Person{
	String name;
	int age;
	public void tell(String word){
		System.out.println(word);
	}
}


public class ClassDemo01 {

	public static void main(String[] args) {
		Person per = null;	// declear a class
		per = new Person();	//ʵ��������
		per.name = "yezi";
		per.age = 31;
		per.tell(per.name);
	}

}
