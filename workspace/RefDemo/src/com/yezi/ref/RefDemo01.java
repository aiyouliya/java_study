package com.yezi.ref;

class Ref1{
	int temp =10;
}
public class RefDemo01 {
	public static void main(String[] args) {
		Ref1 r1 =new Ref1();
		r1.temp = 20;
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
//int数据类型可以被修改
//如果 是String类型，则这里打印还是r1先前的值
	}
	public static void tell(Ref1 r2){
		r2.temp = 30;

	}

}
