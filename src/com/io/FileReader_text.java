package com.io;
import java.io.FileReader;

public class FileReader_text {
public static void main(String[] args) throws Exception {
	FileReader fr=new FileReader("ddd.text");
	int b=fr.read();
	while (b!=-1) {
		System.out.print((char)b);
		b=fr.read();
	}
	fr.close();
}
}
