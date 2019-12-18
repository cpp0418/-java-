package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread6 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while (i++ < 5) {
			System.out.println(Thread.currentThread().getName() + "的call（）方法在运行");
			}
		return i;
	}
	
}
public class Thread_test13 {

	public static void main(String[] args) throws Exception, Exception {
		 MyThread6 mt6=	new MyThread6();
		 ExecutorService executor=Executors.newCachedThreadPool();
		 Future<Object> r1=executor.submit(mt6);
		 Future<Object> r2=executor.submit(mt6);
		 executor.shutdown();
		 System.out.println("thread-1返回值结果："+r1.get());
		 System.out.println("thread-2返回值结果："+r2.get());
	}

}
