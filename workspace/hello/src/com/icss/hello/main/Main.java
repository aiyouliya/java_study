package com.icss.hello.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello worlds");
		int[] ints = new int[20];
		try {
			for (int i =0;i<ints.length;i++){
				ints[i]+=1;
				System.out.println(i+1);
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//快捷修复 Ctrl +1;F2
		//快捷删除行 Ctrl +D;
		//快捷在下一行创建代码；shift+enter;
		//快捷运行程序；ctrl+f11;
		//alt+上下箭头；
		//CTRL+ALT 上下箭头，快速复制
		//CTRL+M 把光标所在的视图最大化
		//alt+/ 快速代码补全
		//ctrl +/ 快速注释
	//	int a = (int) 100L;
		

	}

}
