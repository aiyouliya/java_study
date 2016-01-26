package com.yezi.thread;
/*
 * 通过实现Runnable接口实现纯种的创建
 */
public class MyRunnable implements Runnable {
	private String name;
	public MyRunnable (String name) {
		this.name = name;
	}
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + ":"+i);
		}
	}
}
