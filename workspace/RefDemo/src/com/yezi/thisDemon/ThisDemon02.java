package com.yezi.thisDemon;

class People1{
	public void tell(){
		System.out.println(this);
	}
}
public class ThisDemon02 {

	public static void main(String[] args) {
		People1 p = new People1();
		System.out.print(p);
		p.tell();
	}

}
