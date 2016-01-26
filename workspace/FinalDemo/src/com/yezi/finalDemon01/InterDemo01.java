package com.yezi.finalDemon01;

/*
 * 接口中的变量为全局常量
 * 接口中的方法为抽象方法
 */
interface Inter{
	public static final int AGE = 100;	//接口中的变量为全局常量
	public abstract void tell();	//接口中的方法为抽象方法
	
}
interface Inter2{
	public abstract void say();
}
abstract class Abs1{
	public abstract void print();
}

/*
 * 子类可以继承抽象类
 * 子类可以继承接口
 * 子类可以继承多个接口
 * 子类在继承时需实现父类接口或类的抽象方法
 */
class A extends Abs1 implements Inter,Inter2{	//子类可以继承多个接口,子类可以继承抽象类，并实现两个接口的继承
	public void tell(){//接口的子类必需重写接口的抽象方法，并实现
		
	}
	public void say(){//子类继使用接口时，需实现接口的抽象方法，并实现
		
	}
	public void print(){//子类实现父抽象类中的方法 ，否则会编译不通过
		
	}
}
/*
 * 接口可以继承多个接口
 */
interface Inter3 extends Inter,Inter2{	//接口可以继承多个接口
	
}
public class InterDemo01 {

	public static void main(String[] args) {
//		Inter b = Inter();	//接口不可以被直接调用
		A a = new A();	//接口必需通过子类进行调用
		a.tell();
		System.out.println(Inter.AGE);	//常量需要通过接口名来调用。
		a.print();   //调用时，可以直接调用父类的抽象方法，该方法在子类中已经实现
	}

}
