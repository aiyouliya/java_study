package com.yezi.pol;

class A1{
	public void tell1(){
		System.out.println("A--Tell1");
	}
	
}
class B1 extends A1{
	public void tell2(){
		System.out.println("B-- tell2");
	}
}
class C1 extends A1{
	public void tell3(){
		System.out.println("C-- tell3");
	}
}
class D1 extends A1{
	
}
public class PolDemo02 {

	public static void main(String[] args) {
		say(new B1());	//实例化一个B1，可以调用到A1中的tell1
		say(new C1());	//实例化一个C1，可以调用到A1中的tell1
		say(new D1());	//实例化一个D1，可以调用到A1中的tell1
	}

	public static void say(A1 a){	//实现了类的调用任意一个类，均可以调用到A1中的tell1方法
		a.tell1();
	}
}
