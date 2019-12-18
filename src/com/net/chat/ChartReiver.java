package com.net.chat;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChartReiver implements Runnable {
	DatagramSocket ds;

	public ChartReiver(DatagramSocket ds) {
		this.ds=ds;
	}

	@Override
	public void run() {
		
		while (true) {
			try {
			byte[] buf=new byte[1024];
			DatagramPacket packet=new DatagramPacket(buf, buf.length);
			//System.out.println("开始聊天...");
				ds.receive(packet);	
				String str=new String(packet.getData(),0,packet.getLength());
			System.out.println(packet.getAddress()+":"+str);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
		

			}
			
	}

}
}