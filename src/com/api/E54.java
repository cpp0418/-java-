package com.api;

public class E54 {

	public static void main(String[] args) {
		String s1 = "ab我1c爱ab3你cn中5b国a.j7pg";
		char[] zfsz = s1.toCharArray();
		System.out.println("这个字符串的数字是：");
		for (char zf : zfsz) {
			if (zf >= '0' && zf <= '9') {
				System.out.print(zf + " ");
			}
		}
		System.out.println("\n这个字符串的汉字是：");
		for (char zf : zfsz) {
			if (zf >= '\u4E00' && zf <= '\u9EA5') {
				System.out.print(zf);
			}
		}
	}
}