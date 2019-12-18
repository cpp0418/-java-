package com.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		Path lujing= Paths.get("D:\\360\\444");
		Files.createDirectories(lujing);
		
		Path wj= Paths.get("D:\\360\\444\\test.txt");
		Files.createFile(wj);
		ArrayList<String> neirong=new ArrayList<>();
		neirong.add("这是一个测试文件");
		Files.write(wj, neirong, StandardOpenOption.APPEND);
		List<String> lines=Files.readAllLines(wj);
		System.out.println("这个文件内容："+lines);
		System.out.println("文件大小为："+Files.size(wj));
	}

}
