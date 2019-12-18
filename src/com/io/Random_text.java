package com.io;


import java.io.RandomAccessFile;

public class Random_text {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=	new RandomAccessFile("time.txt","rw");
		int time=Integer.parseInt(raf.readLine())-1;
		if (time>0) {
			System.out.println("还有"+time+"机会");
			raf.seek(0);
			raf.write((time+"").getBytes());
		}else {
			System.out.println("没有使用机会了");
		}
		raf.close();
	}
}
