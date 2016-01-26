package com.yezi.staticDemo;
/*
 * 使用static声明的属性和方法 只能访问static 声明全局属性和方法
 * 使用static 声明方法，直接通过类名调用 
 * 使用s
 */
class People{
	private String name;
	private static String country= "西安";//静态变量，节省内存
	
	public People(String name){
		this.name = name;
	}
	public void tell(){
		System.out.println("姓名："+name+" 出生地："+country);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		People.country = country;
	}

	
	
	
}
public class staticDemo01 {

	public static void main(String[] args) {
		People.setCountry("北京");//通过类名调用封装后的方法。
		People p1 = new People("椰子");
		p1.tell();
		People p2 = new People("咖啡");
		p2.tell();
		People p3 = new People("芒果");
		p3.tell();
		
	}

}
