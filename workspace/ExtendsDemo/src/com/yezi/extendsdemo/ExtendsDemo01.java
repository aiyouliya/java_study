package com.yezi.extendsdemo;
/*
 * 先定义一个人的类
 */
class Person{
	private String name;
	private int age;
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
	
}
/*
 * 学生可以直接继承人的属性
 */
class Student extends Person{
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void say(){//子类中可以直接调用 父类中的方法
		System.out.println("成绩:"+getScore()+" \n"+getName()+": "+getAge());
	}
}
public class ExtendsDemo01 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setName("椰子");
		s.setScore(40);
		s.say();
	}

}
