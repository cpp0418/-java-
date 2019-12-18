package com.io;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer	caf= CharBuffer.allocate(6);
		System.out.println("这个缓冲区的容量是"+caf.capacity());
		System.out.println("这个缓冲区的界限值是"+caf.limit());
		System.out.println("这个缓冲区的初始位置是"+caf.position());
		//添加三个字母
		System.out.println("添加三个字母");
		caf.put("a");caf.put("b");caf.put("c");
		System.out.println("添加三个元素后这个缓冲区的容量是"+caf.capacity());
		System.out.println("添加三个元素后这个缓冲区的界限值是"+caf.limit());
		System.out.println("添加三个元素后这个缓冲区的初始位置是"+caf.position());
		//反转
		System.out.println("反转");
		caf.flip();
		System.out.println("添加三个元素且反转后这个缓冲区的容量是"+caf.capacity());
		System.out.println("添加三个元素且反转后后这个缓冲区的界限值是"+caf.limit());
		System.out.println("添加三个元素且反转后后这个缓冲区的初始位置是"+caf.position());
		//取出第一个字母
		System.out.println("取出第一个字母");
		System.out.println("取出第一个元素"+caf.get());
		System.out.println("取出第一个元素的界限值是"+caf.limit());
		System.out.println("取出第一个元素的初始位置是"+caf.position());
		//执行clear（）方法
		System.out.println("执行clear()方法");
		caf.clear();
		System.out.println("执行clear()方法的缓冲区的容量是"+caf.capacity());
		System.out.println("执行clear()方法的界限值是"+caf.limit());
		System.out.println("执行clear()方法的初始位置是"+caf.position());
	}

}
