package com.yezi.classdemo;

public class ClassDemon02 {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int sum;
		int num=1000;
		System.out.println(addNum(num));
	}
/**
 * 递归调用  
 * @param num
 * @return
 */
	public static int addNum(int num){
		if(num==1){//程序出口
			return num;
		}else{
			return num+addNum(num-1);
		}
	}
}
