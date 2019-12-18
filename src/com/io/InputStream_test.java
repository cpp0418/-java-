package com.io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStream_test {

	public static void main(String[] args) throws Exception {
	//InputStream bjzf=System.in;
	//InputStreamReader is=new InputStreamReader(bjzf);
	BufferedReader ir=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter is=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("cpp.text")));
	System.out.print("请输入你的年龄：");
	String sr=ir.readLine();
	int age=Integer.parseInt(sr);
	String sp=ir.readLine();
	is.write(sp);
	System.out.println("你明年的年龄为："+(1+age)+"岁");
	}
}
