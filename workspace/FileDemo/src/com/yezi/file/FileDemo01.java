package com.yezi.file;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	public static void main(String[] args) {
		File sfile = new File("myfile.txt");
		if (sfile.exists()) {
			if (sfile.isDirectory()) {
				System.out.println("sfile is a Directory!");
				
			} else {
				System.out.println("sfile is a file.");
			}
			//System.out.println();
			
		} else {
			System.out.println("sfile is not exist!");
			try {
				sfile.createNewFile();
				System.out.println("sfile be created.");
				
				File nameto = new File("myfile_new.txt");
				sfile.renameTo(nameto);		//文件重命名需要满足当前文件与创建的文件在同一个分区，如果不在同一个分区，需使用拷贝。
				System.out.println("myfile is renamed to myfile_new.txt.");
				
			} catch (IOException e) {
				System.out.println("sfile can not be created.");
			}
		}
		if (sfile.exists()) {
			sfile.delete();
			System.out.println("sfile have be deleted");
		}
	}

}
