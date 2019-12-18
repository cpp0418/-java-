package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shuju_shuru {
	static Connection conn = null;

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//通过drivermanager获得数据库连接
		 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbc?useUnicode=true&characterEncoding=utf8", "root", "123456");
		File mulu = new File("d:\\tice");
		File[] files = mulu.listFiles();
		System.out.println("一共有" + files.length + "个文件");
		for (File file : files) {
			System.out.println(file);
			if (file.getName().endsWith("xlsx")) {
				r_and_w_bd(file);
			} else if (file.getName().endsWith("xls")) {
				r_and_w_bd2(file);
			}
		}
	
	}
	private static void r_and_w_bd(File file) throws Exception {
		FileInputStream fin = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		for (int i = 1; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);
			String xuehao = row.getCell(3).getStringCellValue();
			if (xuehao.equals("学号")) {
				continue;
			}
			XSSFCell cell20=row.getCell(19);
			XSSFCell cell21=row.getCell(20);
			if (cell20 != null && cell20 != null) {
				// System.out.println(zuo_shili);
				String zuo_shili = row.getCell(19).getStringCellValue();
				// System.out.println(you_shili);
				String you_shili = row.getCell(20).getStringCellValue();
				// 通过connection对象获得statemaent（）；
				// Statement stmt=conn.createStatement();

				PreparedStatement ydy_yuju = conn
					 .prepareStatement("UPDATE sheet1 set `左眼裸眼视力`=? , `右眼裸眼视力`=? WHERE `学号`=?");
				ydy_yuju.setString(1, zuo_shili);
				ydy_yuju.setString(2, you_shili);
				ydy_yuju.setString(3, xuehao);
				ydy_yuju.executeUpdate();
			}

		}
	}

	public static void r_and_w_bd2(File file) throws Exception {
		FileInputStream fin = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fin);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		for (int i = 1; i < rows; i++) {
			HSSFRow row = sheet.getRow(i);
			String xuehao = row.getCell(3).getStringCellValue();
			
			if (xuehao.equals("学号")) {
				continue;
			}
			HSSFCell cell20=row.getCell(19);
			HSSFCell cell21=row.getCell(20);
			if (cell20!= null && cell21 != null) {
				// System.out.println(zuo_shili);
				String zuo_shili = cell20.getStringCellValue();
			
				// System.out.println(you_shili);
				String you_shili = cell21.getStringCellValue();
				// 通过connection对象获得statemaent（）；
				// Statement stmt=conn.createStatement();

				PreparedStatement ydy_yuju = conn
						.prepareStatement("UPDATE sheet1 set `左眼裸眼视力`=? , `右眼裸眼视力`=? WHERE `学号`=?");
				ydy_yuju.setString(1, zuo_shili);
				ydy_yuju.setString(2, you_shili);
				ydy_yuju.setString(3, xuehao);
				ydy_yuju.executeUpdate();
			}
		}

	}

}
