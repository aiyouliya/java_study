package com.yezi.classDemon04;
/*
 * ���췽������������ͬ
 * �������η�   ����  (){
 * 	�������
 * }
 * ���췽�����Ʊ���������һ��
 * ���췽��û�з���ֵ
 * 
 * ���췽����Ϊ���е����Գ�ʼ��
 */
class Cat{
	int age;
	String name;
	public Cat(int a, String n){//���췽����������ͬ
		age =a;
		name = n;
		System.out.println("hello " +name+" "+age+ "!");
	}
	
	public Cat(int a){
		age =a;
		System.out.println("age is :"+age+"!");
	}
}

/*
 * ���췽������ֱ��ִ�У����õ��á�ֻ����ʵ��������Զ�ִ��
 */
public class ClassConstractMethod {

	public static void main(String[] args) {
	/*
	 * ���췽��������
	 * ����������Cat���췽�������ݴ��ݵĲ�����һ����ѡ��ͬ�ķ���
	 */
		Cat Tom = new Cat(3,"yezi");
		Cat Jim = new Cat(100);
		

	}

}
