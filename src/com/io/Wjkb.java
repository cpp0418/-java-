package com.io;


import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Wjkb {

	public static void main(String[] args) throws Exception {
	RandomAccessFile ywj=new RandomAccessFile("d:\\360Downloads.rar","rw");
	//源文件通道
	FileChannel ytd=ywj.getChannel();
	//目标文件
	RandomAccessFile mbwj=new RandomAccessFile("d:\\360Downloads2.rar","rw");
	//目标件通道
	FileChannel mbtd=mbwj.getChannel();
		long cg=ytd.transferTo(0, ytd.size(), mbtd);
		if (cg>0) {
			System.out.println("复制成功");
		}
		ywj.close();
		ytd.close();
		mbwj.close();
		mbtd.close();
	}

}
