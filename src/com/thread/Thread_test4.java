package com.thread;
class tickwindow extends Thread{
	
	public tickwindow(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	private int tickets=100;
	public void run(){
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在售出第"+tickets--+"张票");
			}else {
				break;
			}
		}
	}
}
public class Thread_test4 {

	public static void main(String[] args) {
	new tickwindow("窗口一").start();
	new tickwindow("窗口二").start();
	new tickwindow("窗口三").start();
	new tickwindow("窗口四").start();

	}

}
