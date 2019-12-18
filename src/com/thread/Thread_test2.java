package com.thread;

class Mythread2 implements Runnable {

	public void run() {
		int i = 0;
		while (i++ < 5) {
			System.out.println(Thread.currentThread().getName() + "run方法正在运行");
		}
	}
}

public class Thread_test2 {

	public static void main(String[] args) {
	Mythread2 t1=new Mythread2();
	new Thread(t1, "线程1").start();
	Mythread2 t2=new Mythread2();
	new Thread(t2, "线程2").start();
	Mythread2 t3=new Mythread2();
	new Thread(t3, "线程3").start();
	}

}
