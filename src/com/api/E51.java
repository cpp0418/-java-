package com.api;

public class E51 {

	public static void main(String[] args) {
		String str1="没有构造方法的字符串";
		String str2=new String("没有构造方法的字符串");
		String str3=new String();
		char[] zfgz=new char[] {'a','b','c','d'};
		String str4=new String(zfgz);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println('a'+str3+'b');
		System.out.println(str4);
	}

}
