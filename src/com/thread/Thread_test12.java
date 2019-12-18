package com.thread;
class DeadLovkThread implements  Runnable {
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	
	public DeadLovkThread(boolean flag) {
		super();
		this.flag = flag;
	}

	public void run() {
		if (flag) {
			while (true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName() + "---if---chopsticks");
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName() + "---if---knifeAndFork");
				}
				}
			}
		}else {
			while (true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName() + "---else---knifeAndFork");
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName() + "---else---chopsticks");
				}
			}
		}
	}
}
}
public class Thread_test12 {
public static void main(String[] args) {
	new Thread(new DeadLovkThread(true),"Chinese").start();
	new Thread(new DeadLovkThread(false),"American").start();
}
}
