package com.jdbc;

import java.sql.*;





public class Gojianlujin {

	public static void main(String[] args) throws Exception {
		//加载数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		//通过drivermanager获得数据库连接
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbc", "root", "123456");
		//通过connection对象获得statemaent（）；
		Statement	stmt=conn.createStatement();
		//定义sql语句
		String sql="UPDATE tb_user SET email='jake@qq.com' WHERE id=1";
		stmt.execute(sql);
	}

}
