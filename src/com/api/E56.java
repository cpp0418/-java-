package com.api;

public class E56 {

	public static void main(String[] args) {
		String s="2019-10-12";
		System.out.println("今天是"+s.substring(8)+"号");
		System.out.println("今天是"+s.substring(5,7)+"月");
		System.out.println("今天是"+s.substring(0,4)+"年");
		//splits是将一个字符串打碎成几个字符串数组；
		String[] zfcsz=s.split("-");
		System.out.println("今天是"+zfcsz[0]+"年"+zfcsz[1]+"月"+zfcsz[2]+"日");
	}

}
