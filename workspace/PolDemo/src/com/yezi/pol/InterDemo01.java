package com.yezi.pol;

interface USB{
	/*
	 * interface 只能是公共抽象类，所以public abstract可以省略
	 */
	void start();
	void stop();
}
/*
 * 定义一个公共类，USB接口的工作
 */
class PC{
	public static void work(USB u) {
		u.start();
		System.out.println("工作中");
		u.stop();
	}
}
class UsbDisk implements USB{//UsbDisk继承USB接口

	@Override//重写接口中的抽象方法
	public void start() {
		System.out.println("U盘开始工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘停止工作");		
	}
	
}
class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开始工作");
		
	}

	@Override
	public void stop() {
		System.out.println("打印机停止工作");
		
	}
	
}
/*
 * 主函数
 */
public class InterDemo01 {

	public static void main(String[] args) {
		PC.work(new UsbDisk());
		PC.work(new Printer());
	}

}
