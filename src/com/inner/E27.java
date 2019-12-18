package com.inner;
@FunctionalInterface
interface Printable_{
	void print(StringUtils stringUtils, String str);
}

public class E27 {

	public static void main(String[] args) {
		PrintUpper(new StringUtils(),"Hello",(Object,t)->Object.printUpperCase(t));
		PrintUpper(new StringUtils(),"World",(Object,t)->Object.printUpperCase(t));
	}

	
	private static void PrintUpper(StringUtils stringUtils, String string, Printable_ pt) {
		pt.print(stringUtils,string);
		
	}

}
