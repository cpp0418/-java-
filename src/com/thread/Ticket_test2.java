package com.thread;
class tickwindow2 implements Runnable{

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
public class Ticket_test2 {

	public static void main(String[] args) {
		tickwindow2 t2=new tickwindow2();
		new Thread(t2, "窗口一").start();
		new Thread(t2, "窗口二").start();
		new Thread(t2, "窗口三").start();
		new Thread(t2, "窗口四").start();

	}

}
