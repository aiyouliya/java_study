package com.yezi.thread;
/*
 * 通过继承Thread类实现多线程
 */
public class MyThread extends Thread{
	private String name;
	public MyThread	(String name) {
		this.name =  name;
	}
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + ": "+i);
			super.run();
		}
		
	}
}


