package com.io;
import java.io.FileReader;
import java.io.FileWriter;
public class BufferWeite_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d:\\writer.text");
		FileWriter fw=new FileWriter("writer2.text");
		int b = fr.read();
		char[] buff=new char[1024];
		while (b!= -1) {
			fw.write(buff,0,b);
			b = fr.read(buff);
		}
		fr.close();
		fw.close();
	}	
}
