package com.api;

public class Copy {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	int b[]= {7,8,9,56,69,0};
	System.arraycopy(a, 2, b, 0, 5);
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
		
	}
}
}