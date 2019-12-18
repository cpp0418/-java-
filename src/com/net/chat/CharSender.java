package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class CharSender implements Runnable {
	private DatagramSocket ds;
	private int i;

	public CharSender(DatagramSocket ds, int i) {
		// TODO 自动生成的构造函数存根
		this.ds=ds;
		this.i=i;
	}

	@Override
	public void run() {
		
		while (true) {
			System.out.println("我说");
		try {
			Scanner sc=new Scanner(System.in);
			
		String string=sc.nextLine();
		
		System.out.println("输入你要发送的ip：");
		String ip=sc.nextLine();
		DatagramPacket packet=new DatagramPacket(string.getBytes(), string.getBytes().length, InetAddress.getByName(ip),8900);
	 //System.out.println("正在发送信息....");
			ds.send(packet);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}
}
