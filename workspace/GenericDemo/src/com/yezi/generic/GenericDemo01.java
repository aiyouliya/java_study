package com.yezi.generic;

/*
 * ���ͼ�������ʱ����ָ���������ͣ���ʹ��ʱ������Ҫ��������
 */
class Point<T>{	//T����������
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
		Point<String> p = new Point<String>();	//��ʹ��String��������ʱ��ֱ��ʵ����ΪString
		p.setX("line is 100");
		p.setY("hight is 200");
		System.out.println(p.getX()+p.getY());
		
		Point<Integer> p2 = new Point<Integer>();	//��ʹ��Integer���ͣ���ֱ��ʵ����ΪInteger
		p2.setX(10);
		p2.setY(2000);
		System.out.println("line is:"+p2.getX()+" hight is :"+ p2.getY());
		
	}

}
