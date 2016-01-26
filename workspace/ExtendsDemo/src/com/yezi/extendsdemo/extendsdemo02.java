package com.yezi.extendsdemo;
/*
 * 类可以单继承
 * 一个子类只可以继承一个父类
 * 子类可以继承子类，即一个儿子只可以有一个亲生父亲
 */
class Man{
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Worker extends Man{
	
}
class PetWorker extends Worker{
	public void tell(){
		System.out.println(getAge());
	}
}

public class extendsdemo02 {

	public static void main(String[] args) {
		PetWorker w = new PetWorker();
		w.setAge(90);
		w.getAge();
		w.tell();
	}

}
