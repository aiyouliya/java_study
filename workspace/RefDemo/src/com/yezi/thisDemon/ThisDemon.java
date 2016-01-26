package com.yezi.thisDemon;
/*
 * this 的使用
 * 1.表示类中的属性和调用方法
 * 2.调用本类中的构造方法
 * 表示当前对象
 */
class Dog{
	private String name;
	private int age;
	
	public Dog(String name,int age){
		this();//必需放在首行，调用构造方法执行
		this.name =name;
		this.age =age;
	}
	public Dog (){
		System.out.println("no paramter");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void tell(){
		System.out.println("姓名"+this.getName()+" 年龄"+this.getAge());
	}
}
public class ThisDemon {

	public static void main(String[] args) {
		Dog Gaof = new Dog("高飞",20);
		Gaof.tell();
	}

}
