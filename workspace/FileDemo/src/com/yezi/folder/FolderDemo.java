package com.yezi.folder;

import java.io.File;

public class FolderDemo {

	public static void main(String[] args) {
		File myfolder = new File("my_folder");
		if (myfolder.mkdir()) {
			
			/*使用mkdir创建文件夹需要输入的文件路径已经存在，如果不存在，则不可以被创建。
			 * 即new file对象时，使用mkdir只能是文件夹名，而不能带不存在的路径
			 * 如果要创建多级文件夹，需使用mkdirs()方法
			 */
			
			System.out.println("my_folder be created.");
		} else {
			if (myfolder.exists()) {
				System.out.println("my_folder was exists.");
			} else {
				System.out.println("my_folder created fail.");
			}

		}
		
	}

}
