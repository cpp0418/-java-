package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Mythread3 implements Callable<Object> {
	@Override
	public Object call() throws Exception {	
		int i = 0;
		while (i++ < 5) {
		System.out.println(Thread.currentThread().getName() + "run方法正在运行");
		}
		return i;
	}
}
public class Thread_test3 {

	public static void main(String[] args) {
	Mythread3 myt1=new	Mythread3();
	FutureTask<Object>ft1=new FutureTask<>(myt1);
	Thread thread1=new Thread(ft1, "线程1");
	thread1.start();
	FutureTask<Object>ft2=new FutureTask<>(new Mythread3());
	Thread thread2=new Thread(ft2, "线程2");
	thread2.start();
	FutureTask<Object>ft3=new FutureTask<>(new Mythread3());
	Thread thread3=new Thread(ft3, "线程3");
	thread3.start();
	new Thread(new FutureTask<>(new Mythread3()), "线程4").start();;
	}

}
