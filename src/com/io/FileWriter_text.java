package com.io;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriter_text {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("ddd.text");
		FileWriter fw=new FileWriter("writer.text");
		int b = fr.read();
		for (int i = 0; i < 100; i++) {

			fw.write("再别康桥\r\n");
			fw.write("------------徐志摩！\r\n");
		}

		while (b != -1) {
			System.out.print((char) b);
			b = fr.read();
		}
		fr.close();
		fw.close();
	}
}

