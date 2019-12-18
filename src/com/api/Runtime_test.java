package com.api;

import java.io.IOException;

public class Runtime_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("本机有多少个处理器："+rt.availableProcessors()+"个");
		System.out.println("本机有多少空闲内存："+rt.freeMemory()/1024/1024+"mb");
		System.out.println("本机最大内存空间："+rt.maxMemory()/1024/1024+"mb");
		Process jincheng=rt.exec("notepad");
		Thread.sleep(1000);
		jincheng.destroy();
	}

}
