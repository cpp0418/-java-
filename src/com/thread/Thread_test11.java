package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class tickwindow5 implements Runnable {

	private int tickets =10;
	private final Lock lock=new ReentrantLock();
	public void run() {
		while (true) {
			lock.lock();
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
					e.printStackTrace();
					}finally {
					lock.unlock();}
				if (tickets>=1) {
				System.out.println(Thread.currentThread().getName() + "正在售出第" + tickets-- + "张票");
			
				}else {break;}
			} 
		}
	}
}
public class Thread_test11 {

	public static void main(String[] args) {
		tickwindow5 t2 = new tickwindow5();
		new Thread(t2, "窗口一").start();
		new Thread(t2, "窗口二").start();
		new Thread(t2, "窗口三").start();
		new Thread(t2, "窗口四").start();
	}

}
