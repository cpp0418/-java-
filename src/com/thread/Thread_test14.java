package com.thread;

import java.util.concurrent.CompletableFuture;

public class Thread_test14 {
public static void main(String[] args) throws Exception, Exception {
	CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{
		int sum=0,i=0;
		while (i++<11) {
			sum+=i;
			System.out.println(Thread.currentThread().getName()+"线程任务正在执行....i:"+i);
		}
		return sum;
	});
	CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{
		int sum=0;
		for (int j = 11; j <21; j++) {
			sum+=j;
			System.out.println(Thread.currentThread().getName()+"线程任务正在执行....i:"+j);
		
		}	
		return sum;
	});
	int total=cf1.get()+cf2.get();
	System.out.println("两个数的和为："+total);
}
}
