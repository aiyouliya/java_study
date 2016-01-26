package com.yezi.finalDemon01;

abstract class Abs{
	private int age;
	public void tell(){
	}
	//抽象方法,只有类的声明是abstract 才可以创建abstract method.
	public abstract void say();
	public abstract void print();
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
class Abschild extends Abs{
	public void say(){//抽象类的子类必需重写父类的所有抽象方法
		System.out.println(this.getAge());
	}
	public void print(){
		
	}
}


public class AbsDemo01 {

	public static void main(String[] args) {
//		Abs a = new Abs();	//抽象类不能被直接实例化
	}
	Abschild a = new Abschild();//抽象类必需通过子类进行实例化
	

}
