package com.thread;
class YieladThread extends Thread{

	public YieladThread(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName() + "---"+i);
			if (i==2) {
				System.out.println("线程让步");
				Thread.yield();
			}
		}
}
}
public class Thread_test7 {

	public static void main(String[] args) {
		Thread t1=new YieladThread("线程1");
		Thread t2=new YieladThread("线程2");
		t1.start();
		t2.start();
	}

}
