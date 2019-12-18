package com.api;

public class E53 {

	public static void main(String[] args) {
		String s1="ab1cab3cn5ba.j7pg";
		if (s1.startsWith("abc")) {
			System.out.println("这个字符串是以abc开头");
		}
		if (s1.endsWith("jpg")) {
			System.out.println("这个字符串是以jpg结尾");
		}
		if (s1.contains("abc")) {
			System.out.println("这个字符串是以包含abc");
		}
		if (! s1.isEmpty()) {
			System.out.println("这个字符串不是以空字符");
		}
		if (s1.startsWith("a")) {
			System.out.println("这个字符串是以a开头");
			//将字符串打碎成字符数组
			char[] zfsz=s1.toCharArray();
		for (int i = 0; i < zfsz.length; i++) {
			char c = zfsz[i];
			if (i==zfsz.length-1) {
				System.out.print(c+"");
			}
			else {
				System.out.print(c+",");
			}
		}
	}
	}
}
