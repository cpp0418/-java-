package com.api;

public class E55 {

	public static void main(String[] args) {
		String s1="java";
		System.out.println("把字符串字母改为大写："+s1.toUpperCase());
		System.out.println("把12改为字符串的结果："+String.valueOf(12));
		String s2="    http:// app .com ";
		System.out.println("把字符串两端空格去掉:"+s2.trim());
		System.out.println("把字符串所以空格去掉:"+s2.replace(" ",""));
		System.out.println("空格去掉后的结果:"+s2.replaceAll("\\S+", ""));
	}

}
