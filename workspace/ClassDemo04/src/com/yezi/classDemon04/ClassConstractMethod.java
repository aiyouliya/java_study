package com.yezi.classDemon04;
/*
 * 构造方法，与类名相同
 * 访问修饰符   类名  (){
 * 	程序语句
 * }
 * 构造方法名称必须与类名一致
 * 构造方法没有返回值
 * 
 * 构造方法是为类中的属性初始化
 */
class Cat{
	int age;
	String name;
	public Cat(int a, String n){//构造方法与类名相同
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
 * 构造方法可以直接执行，不用调用。只进行实例化后会自动执行
 */
public class ClassConstractMethod {

	public static void main(String[] args) {
	/*
	 * 构造方法的重载
	 * 定义了两个Cat构造方法，根据传递的参数不一样，选择不同的方法
	 */
		Cat Tom = new Cat(3,"yezi");
		Cat Jim = new Cat(100);
		

	}

}
