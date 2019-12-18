package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileinputStream {

	public static void main(String[] args) throws Exception  {
		FileInputStream in=new FileInputStream("d:\\tp.jpg");
		FileOutputStream out=new FileOutputStream("tp.jpg");
		long kssj=System.currentTimeMillis();
		int b=in.read();
		byte[] zjhc=new byte[1024];
		while (b!=-1) {
			//System.out.print((char)b);
			out.write(zjhc,0,b);
			b=in.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		//out.write(",come on!".getBytes());
		System.out.println("拷贝186kb图片耗时"+(jssj-kssj)+"毫秒");
		in.close();
		out.close();
	}

}
