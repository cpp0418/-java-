package com_ljhs;
class person{
	public void finalize() {
		System.out.println("对象将作为垃圾回收。。。");
	}
}

public class E37 {

	public static void main(String[] args) {
		ljhs1(); 
		ljhs2();
	}

	private static void ljhs1() {
		person p1=new person();
		p1=null;
		int i=1;
		while (i<10) {
			System.out.println("方法1循环中。。。。");
			i++;
		}
    
		
	}

	private static void  ljhs2() {
		person p2=new person();
		p2=null;
		int i=1;
		System.gc();
		while (i<10) {
			System.out.println("方法2循环中。。。。");
			i++;
		}

		
	}

}
