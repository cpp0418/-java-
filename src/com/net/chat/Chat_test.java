package com.net.chat;

import java.net.DatagramSocket;


public class Chat_test {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(8900);
		new Thread(new ChartReiver(ds),"接收服务").start();
		new Thread(new CharSender(ds,3000),"发送服务").start();
	}

}
