package com.jdbc;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Putong_chaxun {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//通过drivermanager获得数据库连接
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbc", "root", "123456");
		//通过connection对象获得statemaent（）；
		Statement	stmt=conn.createStatement();
		//定义sql语句
		String sql="select * from tb_user";
		System.out.println("id	|	name	|	sex	|	email");
		ResultSet  sr=stmt.executeQuery(sql);
		while(sr.next()) {
			int id=sr.getInt("id");
			String name=sr.getString("name");
			String sex=sr.getString("sex");
			String email=sr.getString("email");
			System.out.println(id+"	|	"+name+"	|	"+sex+"	|	"+email);
		}
	}

}
