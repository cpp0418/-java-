package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File_tice {
	static Connection conn=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//通过drivermanager获得数据库连接
		 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbc?useUnicode=true&characterEncoding=utf8", "root", "123456");
		File fiel=new File("d:\\tice");
		File[] wenji_jihe=fiel.listFiles();
		System.out.println(wenji_jihe.length);
		for (File file : wenji_jihe) {
			System.out.println(file);
			if (file.getName().endsWith("xlsx")) {
				dwj(file);
			} else if (file.getName().endsWith("xls")){
				dwj2(file);
			}
		}

	}
	public static void dwj(File wjm) throws Exception {
	FileInputStream fin=new FileInputStream(wjm);
	XSSFWorkbook workbook=new XSSFWorkbook(fin);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rows=sheet.getLastRowNum();
	for (int i = 1; i < rows; i++) {
		XSSFRow row=sheet.getRow(i);
		String xuehao=row.getCell(3).getStringCellValue();
		System.out.println(xuehao);
		if (xuehao.equals("学号")) {
			continue;
		}
		String zuo_shili=row.getCell(19).getStringCellValue();
		if (zuo_shili!=null) {
		//System.out.println(zuo_shili);
		String you_shili=row.getCell(20).getStringCellValue();
		//System.out.println(you_shili);
		
		//通过connection对象获得statemaent（）；
		//Statement	stmt=conn.createStatement();
		
			PreparedStatement  ydy_yuju=conn.prepareStatement("UPDATE sheet1 set `左眼裸眼视力`=? , `右眼裸眼视力`=? WHERE `学号`=?");
		ydy_yuju.setString(1, zuo_shili);
		ydy_yuju.setString(2, you_shili);
		ydy_yuju.setString(3, xuehao);
		}
		
	}
}
	public static void dwj2(File wjm) throws Exception {
		FileInputStream fin=new FileInputStream(wjm);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i = 1; i < rows; i++) {
			XSSFRow row=sheet.getRow(i);
			String xuehao=row.getCell(3).getStringCellValue();
			System.out.println(xuehao);
			if (xuehao.equals("学号")) {
				continue;
			}
			String zuo_shili=row.getCell(19).getStringCellValue();
			if (zuo_shili!=null) {
			//System.out.println(zuo_shili);
			String you_shili=row.getCell(20).getStringCellValue();
			//System.out.println(you_shili);
			
			//通过connection对象获得statemaent（）；
			//Statement	stmt=conn.createStatement();
			
				PreparedStatement  ydy_yuju=conn.prepareStatement("UPDATE sheet1 set `左眼裸眼视力`=? , `右眼裸眼视力`=? WHERE `学号`=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			}
			
		}
	}
}
