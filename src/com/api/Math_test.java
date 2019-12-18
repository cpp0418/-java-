package com.api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("计算-4绝对值的结果："+Math.abs(-4));
		System.out.println("计算2的正弦结果："+Math.sin(2));
		System.out.println("计算2的余弦结果："+Math.cos(2));
		System.out.println("计算4平方根的结果："+Math.sqrt(4));
		System.out.println("计算4立方根的结果："+Math.cbrt(4));
		System.out.println("计算4绝对值的结果："+Math.pow(4, 2));
		//天花板：ceil，地板：floor
		System.out.println("求大于3.4参数的最小整数："+Math.ceil(3.4));
		System.out.println("求小于3.4参数的最大整数："+Math.floor(3.4));
		System.out.println("求对3.4四舍五入的结果："+Math.round(3.4));
		System.out.println("求大两个数的较大值："+Math.max(5.1, 5.5));
		System.out.println("求大两个数的较大值："+Math.min(5.1, 5.5));
		System.out.println("生成一个大于等于0.0小于10的随机数"+Math.random());
		System.out.println("求一个数的整数："+(int)(-3.6));
	}

}
