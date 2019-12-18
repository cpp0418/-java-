package com.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BJbh1 {
	public static void main(String[] args) throws Exception {
		Path wj= Paths.get("D:\\班级信息.txt");
		Path bjmc= Paths.get("D:\\求班级编号.txt");
		Path bjbh= Paths.get("D:\\班级编号.txt");
		ArrayList<String> neirong=new ArrayList<>();
		List<String> lines=Files.readAllLines(wj);
		List<String> names=Files.readAllLines(bjmc);
		Files.createFile(bjbh);
		HashMap<String, String> map=new  HashMap<>();
		for (String line : lines) {
			String[] zfcsz=line.split("\t");
			map.put(zfcsz[1], zfcsz[0]);
		}
		for (String name : names) {
			neirong.add(map.get(name));
		}
		Files.write(bjbh, neirong, StandardOpenOption.APPEND);
	}

}
