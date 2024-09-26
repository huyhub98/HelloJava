package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	public static void main(String[] args) {
		///TEST THU
		JDBCConnection jdbcConnection 
			= new JDBCConnection();
		
		Connection conn = jdbcConnection.getConnection();
		if (conn != null) {
			System.out.println("THANH CONG!");
		}
	}

	public Connection getConnection() {
		try {
			final String user = "root";
			final String password = "";
			final String url = "jdbc:mysql://localhost:3306/javacore15";

			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = 
				DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			System.out.println("Loi ket noi:" + e);
		}

		return null;
	}
}
