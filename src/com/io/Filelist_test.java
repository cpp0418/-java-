package com.io;

import java.io.File;
import java.util.Arrays;

public class Filelist_test {

	public static void main(String[] args) {
		File ml=new	File("E:\\java基础作业");
		fileDir(ml);
	
	}
	private static void fileDir(File ml) {
		File[] ls=ml.listFiles();
		for(File files:ls){
		if (files.isDirectory()) {
		fileDir(files);
	
		} else if(ml.isAbsolute()) {
			String[] zml=ml.list((dir,name)->name.endsWith(".java"));
			Arrays.stream(zml).forEach(f->System.out.println(f));
		}
	}
}	
}