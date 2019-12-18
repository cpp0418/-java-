package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Net_test2 {

	public static void main(String[] args) throws Exception {
		DatagramSocket c1=new DatagramSocket(3000);
		String string="来自盼盼的问候";
		DatagramPacket packet=new DatagramPacket(string.getBytes(), string.getBytes().length, InetAddress.getByName("10.2.103.31"), 8900);
		System.out.println("开始发送信息....");
		c1.send(packet);
		c1.close();
	}

}
