package com.net;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class TcpCliend {

	public static void main(String[] args) throws Exception{
		Socket khd=new Socket("10.2.103.34",8899);
		OutputStream os=khd.getOutputStream();
		FileInputStream fin=new FileInputStream("d:\\1.jpg");
		byte[] zjhc=new byte[1024];
		int len=fin.read(zjhc);
		while (len!=-1) {
			os.write(zjhc,0,len);
			len=fin.read(zjhc);
		}
		khd.shutdownOutput();
		InputStream is=khd.getInputStream();
		 len=is.read(zjhc);
		while (len!=-1) {
			System.out.println(new String(zjhc,0,len));
			len=is.read(zjhc);
		}
		os.close();
		is.close();
		khd.close();
	}

}
