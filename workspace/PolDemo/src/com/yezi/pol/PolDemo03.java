package com.yezi.pol;

class AA{
	public void tell1(){
		System.out.println("AA--tell1");
	}
	public void tell2(){
		System.out.println("AA--tell2");
	}
}
/*
 * 定义一个类BB，继承AA，并重写AA中的tell1方法
 * BB中实现一个tell3方法
 */
class BB extends AA{
	public void tell1(){
		System.out.println("BB--tell1");
	}
	public void tell3(){
		System.out.println("BB--tell3");
	}
}

/*
 * 
 */
public class PolDemo03 {

	public static void main(String[] args) {
		AA aa = new AA();
		System.out.println(aa instanceof AA);
		System.out.println(aa instanceof BB);
		
		AA  bb = new BB();	//向下转型
		System.out.println(bb instanceof AA);
		System.out.println(bb instanceof BB);
	}

}
