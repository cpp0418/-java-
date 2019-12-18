package com.api;

public class E52 {

	public static void main(String[] args) {
		String s1="abcabcnba.jpg";
		System.out.println("字符串的长度为："+s1.length());
		System.out.println("第一个字符为："+s1.charAt(0));
		System.out.println("第二个字符为："+s1.charAt(1));
		System.out.println("第三个字符为："+s1.charAt(2));
		//驼峰命名法，第一个单词首字母小写，后面的单词首字母大写。。
		System.out.println("字符c第一次出现的位置："+s1.indexOf('c'));
		System.out.println("字符c最后出现的位置："+s1.lastIndexOf(99));
	}

}
