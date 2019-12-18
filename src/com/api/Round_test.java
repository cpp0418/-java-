package com.api;

import java.util.Random;

public class Round_test {

	public static void main(String[] args) {
		//生成【0,1）之间的浮点数
		System.out.println("生成【1,0）之间的随机浮点数："+Math.random());
		Random r=new Random();
		System.out.println("生成【1,0）之间的随机浮点数："+r.nextDouble());
		//生成整数
		System.out.println("生成-21亿和21亿之间的整数："+r.nextInt());
		System.out.println("生成包含0但不包含10之间的整数："+r.nextInt(10));
	}

}
