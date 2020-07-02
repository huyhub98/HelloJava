package com.quanghuy.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	public static void main(String[] args) {
		// test
		JDBCConnection jdbcConnection = new JDBCConnection();
		Connection conn = jdbcConnection.getConnection();
		if (conn != null) {
			System.out.println("Thành công");
		}
	}

	public Connection getConnection() {
		try {
			final String user = "root";
			final String password = "";
			final String url = "jdbc:mysql://localhost:3306/Test_JDBC";

			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			System.out.println("Lỗi kết nối " + e);
		}
		return null;
	}
}
