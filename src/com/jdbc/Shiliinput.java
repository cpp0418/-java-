package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Shiliinput {

	public static void main(String[] args) throws Exception {
	FileInputStream fin=new FileInputStream("shili.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fin);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rows=sheet.getLastRowNum();
	for (int i = 1; i < rows; i++) {
		XSSFRow row=sheet.getRow(i);
		String xuehao=row.getCell(3).getStringCellValue();
		System.out.println(xuehao);
		String zuo_shili=row.getCell(15).getStringCellValue();
		System.out.println(zuo_shili);
		String you_shili=row.getCell(16).getStringCellValue();
		System.out.println(you_shili);
		Class.forName("com.mysql.jdbc.Driver");
		//通过drivermanager获得数据库连接
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbc?useUnicode=true&characterEncoding=utf8", "root", "123456");
		//通过connection对象获得statemaent（）；
		//Statement	stmt=conn.createStatement();
		PreparedStatement  ydy_yuju=conn.prepareStatement("UPDATE 18rj2 set `左眼裸眼视力`=? , `右眼裸眼视力`=? WHERE `学号`=?");
		ydy_yuju.setString(1, zuo_shili);
		ydy_yuju.setString(2, you_shili);
		ydy_yuju.setString(3, xuehao);
		//定义sql语句
		//String sql="UPDATE 18rj2 set `左眼裸眼视力`='"+zuo_shili+"' , `右眼裸眼视力`='"+you_shili+"'WHERE `学号`='"+xuehao+"'";
		//String sql1="UPDATE 18rj2 set `右眼裸眼视力`='"+you_shili+"' WHERE `学号`='"+xuehao+"'";
		/*System.out.println(sql);
		//stmt.execute(sql1);
		stmt.execute(sql);*/
	}
	}

}
