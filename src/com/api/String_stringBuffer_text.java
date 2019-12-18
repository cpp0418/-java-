package com.api;

public class String_stringBuffer_text {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
	}
}
