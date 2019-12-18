package com.yichang;
class BlcException extends Exception{

	public BlcException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BlcException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
public class E31 {

	public static void main(String[] args)  {
		try {
			int result=divide(4,0);
		System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获异常代码:"+e.getLocalizedMessage());
			}
		
	}

	private static int divide(int i, int j)throws BlcException {
		if (j==0) {
			throw new BlcException("除数不能为0");
		}
		int result=i/j;
		return result;
	}

}
