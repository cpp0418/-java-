package com.thread;

class tickwindow3 implements Runnable {

	private int tickets =100;
	Object lock = new Object();
	
	public void run() {
		while (true) {
			synchronized (lock) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
					e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在售出第" + tickets-- + "张票");
				} 
			}
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "正在售出第" + tickets-- + "张票");
			}else {
					break;
				}
		}
	}
}

public class Thread_test9 {
	public static void main(String[] args) {
		tickwindow3 t2 = new tickwindow3();
		new Thread(t2, "窗口一").start();
		new Thread(t2, "窗口二").start();
		new Thread(t2, "窗口三").start();
		new Thread(t2, "窗口四").start();

	}
}
