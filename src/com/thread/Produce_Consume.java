package com.thread;

import java.util.ArrayList;
import java.util.List;

public class Produce_Consume {

	public static void main(String[] args) {
		List<Object> goods=new ArrayList<>();
		long start=System.currentTimeMillis();
		Thread thread1=new Thread(()->{
			int num=0;
			while (System.currentTimeMillis()-start<=50) {
				synchronized (goods) {
					if (goods.size()>0) {
						try {
							goods.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
				else {
					goods.add("商品"+(++num));
				System.out.println("生产商品"+num);
				}
				}	
			}},"生产者");
		
		Thread thread2=new Thread(()->{
			int num=0;
			while (System.currentTimeMillis()-start<=50) {
				synchronized (goods) {
					if (goods.size()<=0) {
						goods.notify();
					}
				else {
					goods.add("商品"+(++num));
				System.out.println("生产商品"+num);
				}
				}	
			}},"生产者");
		thread1.start();
		thread2.start();
		}
	}


