package com.yezi.thread;
/*
 * 线程的一些方法 
 * 1.获取当前纯种的名称	Thread.currentThread().getName()
 * 2.判断线程是否活着	Thread.isAlive()
 * 3.线程强制执行		Thread.jion()
 * 4.线程休眠			Thread.sleep(1000)
 * 5.纯种的礼让			Thread.yeald()
 * 
 */
class RunnableDemo implements Runnable{
	private String name;
	public RunnableDemo(String name){
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);	//线程休眠1秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//获得当前线程对象 thread.currentThread().getName();
			System.out.println("当前线程对象"+Thread.currentThread().getName());
		}
		
	}
}
public class MythreadDemo03 {

	public static void main(String[] args) {
		RunnableDemo r1= new RunnableDemo("A");
//		RunnableDemo r2= new RunnableDemo("B");
		Thread t5 = new Thread(r1);
		//判断当前线程是否活着 isAlive()
		System.out.println(t5.isAlive());
//		Thread t6 = new Thread(r2);
		t5.start();
		System.out.println(t5.isAlive());
//		t6.start();
		for (int i = 0; i < 50; i++) {
			if(i>10){
				try {
					/*
					 * 线程强行执行thread.join()
					 */
					t5.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("主线程："+i);
		}
	}

}
