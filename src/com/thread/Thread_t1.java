package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Mythread8 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		// TODO 自动生成的方法存根
		
		int sum=0;
	
		for (int i = 0; i < 11; i++) {
			sum+=i;
		}
		switch (Thread.currentThread().getName()) {
		case "线程1":
			break;
		case "线程2":
			sum+=100;
			break;
		case "线程3":
			sum+=200;
			break;
		case "线程4":
			sum+=300;
			break;
		case "线程5":
			sum+=400;
			break;
		case "线程6":
			sum+=500;
			break;
		case "线程7":
			sum+=600;
			break;
		case "线程8":
			sum+=700;
			break;
		case "线程9":
			sum+=800;
			break;
		case "线程10":
			sum+=900;
			break;

		default:
			break;
		}
		return sum;
	}
}
public class Thread_t1 {

	public static void main(String[] args) throws Exception, ExecutionException {
		Mythread8 my1=new Mythread8();
		FutureTask<Object>f1=new FutureTask<>(my1);
		Thread t1=new Thread(f1,"线程1");
		t1.start();
		System.out.println("1到10的结果"+f1.get());
		
		Mythread8 my2=new Mythread8();
		FutureTask<Object>f2=new FutureTask<>(my2);
		Thread t2=new Thread(f2,"线程2");
		t2.start();
		
		Mythread8 my3=new Mythread8();
		FutureTask<Object>f3=new FutureTask<>(my3);
		Thread t3=new Thread(f3,"线程3");
		t3.start();
		
		Mythread8 my4=new Mythread8();
		FutureTask<Object>f4=new FutureTask<>(my4);
		Thread t4=new Thread(f4,"线程4");
		t4.start();
		
		Mythread8 my5=new Mythread8();
		FutureTask<Object>f5=new FutureTask<>(my5);
		Thread t5=new Thread(f5,"线程5");
		t5.start();
		
		Mythread8 my6=new Mythread8();
		FutureTask<Object>f6=new FutureTask<>(my6);
		Thread t6=new Thread(f6,"线程6");
		t6.start();
		
		Mythread8 my7=new Mythread8();
		FutureTask<Object>f7=new FutureTask<>(my7);
		Thread t7=new Thread(f7,"线程7");
		t7.start();
		
		Mythread8 my8=new Mythread8();
		FutureTask<Object>f8=new FutureTask<>(my8);
		Thread t8=new Thread(f8,"线程8");
		t8.start();
		
		Mythread8 my9=new Mythread8();
		FutureTask<Object>f9=new FutureTask<>(my9);
		Thread t9=new Thread(f9,"线程9");
		t9.start();
		
		Mythread8 my10=new Mythread8();
		FutureTask<Object>f10=new FutureTask<>(my10);
		Thread t10=new Thread(f10,"线程10");
		t10.start();
		//System.out.println("10到20的结果"+f2.get());
		int total=(int)f1.get()+(int)f2.get()+(int)f3.get()+(int)f4.get()+(int)f5.get()+(int)f6.get()+(int)f7.get()+(int)f8.get()+(int)f9.get()+(int)f10.get();
		System.out.println("线程1加 到线程10为"+total);

	}

}
