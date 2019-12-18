package com.net;

import java.net.InetAddress;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress ip1=InetAddress.getLocalHost();
		System.out.println("本机的ip地址："+ip1.getHostAddress());
		
		InetAddress ip2=InetAddress.getByName("www.hbjhart.com");
		System.out.println("江汉艺术职业的web服务器的ip地址："+ip2);
		if (ip2.isReachable(3000)) {
			System.out.println("江汉艺术职业的web服务器的ip地址3秒可访问");
		} else {
			System.out.println("江汉艺术职业的web服务器的ip地址3秒不可访问");
		}
		System.out.println("ip2的主机名"+ip2.getHostName());
	}

}
