package com.yezi.ref;

public class RefDemo02 {

	public static void main(String[] args) {
		String str1 ="Hello";
		System.out.println(str1);
		tell(str1);
		System.out.println(str1);
	}

	public static void tell(String str2){
		str2 = "Tom";
	}
}
