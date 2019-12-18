package com.api;

public class jssj_text {
	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		int sum=0;
		for (long i = 0; i < 100000000000l; i++) {
			sum+=1;
			
		}
		long jssj=System.currentTimeMillis();
		System.out.println("运行时间："+(jssj-kssj)+"毫秒");
}
}
