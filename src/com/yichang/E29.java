package com.yichang;

public class E29 {
	public static int divide(int x,int y) {
		try {
				int result=x/y;
		return result;
		} catch (Exception e) {
			System.out.println("捕获信息异常："+e.getLocalizedMessage());
		}finally {
			System.out.println("无论如何都执行finally语句");
		}
		return -1;
	
			
	}
	public static void main(String[] args) {
		int result=divide(4, 2);
		if (result==-1) {
			System.out.println("出现异常");
		}else {
			System.out.println(result);
		}

	}

}
