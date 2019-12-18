package com.api;

public class Baozhuang_class {

	public static void main(String[] args) {
		int a=20;
		//自动装箱：把int类型的值赋给integer类型
		Integer b=a;
		//自动拆箱：把integer类型的值赋给int类型
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//
		String s="99";
		String s1=s+10;
		//字符串转换整数类型
		System.out.println(s1);
		//第一种方法：用string valueOf（）方法转换为字符串
		System.out.println(" valueOf（）方法-->"+(Integer.valueOf(s)+10));
		//第二种方法：用parsexxx方法字符串转换为基本数据类型
		System.out.println("parsexxx方法-->"+(Integer.parseInt(s)+10));
		//第三种方法：用构造方法将int转换为字符串
		System.out.println("构造方法-->"+(new Integer(s)+10));
		//
		Integer zs=99;
		//整数类型转换字符串
		//第一种方法：用string valueOf（）方法转换为字符串
		System.out.println(" valueOf（）方法-->"+String.valueOf(s));
		//第二种方法：用parsexxx方法字符串转换为基本数据类型
		System.out.println("tostring方法-->"+zs.toString());
		//第三种方法：用构造方法将int转换为字符串
		System.out.println("空接方法-->"+zs+" ");
	}

}
