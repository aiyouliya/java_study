package com.yezi.folder;

import java.io.File;

public class FolderDemo {

	public static void main(String[] args) {
		File myfolder = new File("my_folder");
		if (myfolder.mkdir()) {
			
			/*ʹ��mkdir�����ļ�����Ҫ������ļ�·���Ѿ����ڣ���������ڣ��򲻿��Ա�������
			 * ��new file����ʱ��ʹ��mkdirֻ�����ļ������������ܴ������ڵ�·��
			 * ���Ҫ�����༶�ļ��У���ʹ��mkdirs()����
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
