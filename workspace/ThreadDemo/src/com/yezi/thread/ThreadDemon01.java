package com.yezi.thread;
/*
 * 线程的创建可以通过继承Thread 类实现 
 * 
 * 线程的固定操作状态
 * 创建状态：准备好一个多线程对象
 * 就绪状态：调用了start()方法，等待CPU进行调度
 * 运行状态：执行run()方法
 * 阻塞状态：暂时停止执行，可能将资源交给其他线程使用
 * 终止状态（死亡状态）：线程销毁
 */
public class ThreadDemon01 {

	public static void main(String[] args) {
//		MyThread t1 = new MyThread("A");
//		MyThread t2 = new MyThread("B");
////线程的启动是通过start()启动的，如果通过run方法，则等同于方法的直接调用
////		t1.run();			
////		t2.run();
//		t1.start();
//		t2.start();
	//runnable接口要实现线程的启动，首先要创建线程类。	
		MyRunnable r1 = new MyRunnable("A");
		MyRunnable r2 = new MyRunnable("B");
		Thread t3 = new Thread(r1);
		Thread T4 = new Thread(r2);
		
		t3.start();
		T4.start();
	}

}
