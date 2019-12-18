package com.thread;

class Mythread extends Thread {

	public Mythread(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	public void run() {
		int i = 0;
		while (i++ < 5) {
			System.out.println(Thread.currentThread().getName() + "run方法正在运行");
		}
	}
}

public class Thread_test1 {

	public static void main(String[] args) {
		new Mythread("线程1").start();
		new Mythread("线程2").start();
	}

}
