package com.io;

import java.io.File;
import java.text.SimpleDateFormat;


public class File_test {

	public static void main(String[] args) {
		File file=new File("d:\\sj\\ddd.txt");
		System.out.println("文件的相对路径"+file.getPath());
		System.out.println("文件的绝对路径"+file.getAbsolutePath());
		System.out.println("文件的父路径"+file.getParent());
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是一个文件":"不是一个文件");
		System.out.println(file.isDirectory()?"是一个目录":"不是一个目录");
		SimpleDateFormat S=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println("最后的修改时间为"+S.format(file.lastModified()));
		System.out.println("文件大小是"+file.length()+"bty");
		//System.out.println("是否删除文件"+file.delete());
	}

}
