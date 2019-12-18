package com.thread;

class tickwindow4 implements Runnable {
	private int tickets =10;
	@Override
	public void run() {
		while (true) {
				maipiao();
	
		}
	}
	private synchronized void maipiao() {
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
}
public class Thread_test10 {

	public static void main(String[] args) {
			tickwindow4 t2 = new tickwindow4();
			new Thread(t2, "窗口一").start();
			new Thread(t2, "窗口二").start();
			new Thread(t2, "窗口三").start();
			new Thread(t2, "窗口四").start();

	}

}
