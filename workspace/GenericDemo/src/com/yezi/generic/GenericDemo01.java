package com.yezi.generic;

/*
 * 泛型即定义类时，不指定数据类型，在使用时根据需要定义类型
 */
class Point<T>{	//T是数据类型
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
}

public class GenericDemo01 {

	public static void main(String[] args) {
		Point<String> p = new Point<String>();	//想使用String类型数据时，直接实例化为String
		p.setX("line is 100");
		p.setY("hight is 200");
		System.out.println(p.getX()+p.getY());
		
		Point<Integer> p2 = new Point<Integer>();	//想使用Integer类型，则直接实例化为Integer
		p2.setX(10);
		p2.setY(2000);
		System.out.println("line is:"+p2.getX()+" hight is :"+ p2.getY());
		
	}

}
