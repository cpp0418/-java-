package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Net_test3 {
public static void main(String[] args) throws Exception {
	DatagramSocket s1=new DatagramSocket(8900);
	byte[] buf=new byte[1024];
	DatagramPacket packet=new DatagramPacket(buf, buf.length);
	System.out.println("等待接收...");
	while (true) {
		s1.receive(packet);
		String str=new String(packet.getData(),packet.getLength());
		System.out.println(packet.getAddress()+":"+packet.getPort()+"发送的信息"+str);
	}
}

}
