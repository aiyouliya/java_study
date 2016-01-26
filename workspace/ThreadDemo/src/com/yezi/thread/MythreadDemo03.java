package com.yezi.thread;
/*
 * �̵߳�һЩ���� 
 * 1.��ȡ��ǰ���ֵ�����	Thread.currentThread().getName()
 * 2.�ж��߳��Ƿ����	Thread.isAlive()
 * 3.�߳�ǿ��ִ��		Thread.jion()
 * 4.�߳�����			Thread.sleep(1000)
 * 5.���ֵ�����			Thread.yeald()
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
				Thread.sleep(1000);	//�߳�����1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//��õ�ǰ�̶߳��� thread.currentThread().getName();
			System.out.println("��ǰ�̶߳���"+Thread.currentThread().getName());
		}
		
	}
}
public class MythreadDemo03 {

	public static void main(String[] args) {
		RunnableDemo r1= new RunnableDemo("A");
//		RunnableDemo r2= new RunnableDemo("B");
		Thread t5 = new Thread(r1);
		//�жϵ�ǰ�߳��Ƿ���� isAlive()
		System.out.println(t5.isAlive());
//		Thread t6 = new Thread(r2);
		t5.start();
		System.out.println(t5.isAlive());
//		t6.start();
		for (int i = 0; i < 50; i++) {
			if(i>10){
				try {
					/*
					 * �߳�ǿ��ִ��thread.join()
					 */
					t5.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("���̣߳�"+i);
		}
	}

}
