package com.yezi.thread;

import sun.security.krb5.internal.Ticket;
/*
 * 资源有共享时，需要用到同步 synchronized
 *
 */
class MythreadDemo implements Runnable{

	private int Ticket = 5;
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			//车票同步
			synchronized (this) {
				if (Ticket >0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("车票："+Ticket--);
				}
			}
			
		}
	}
	
}
public class ThreadDemo05 {

	public static void main(String[] args) {
		MythreadDemo m = new MythreadDemo();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
