//package com.trungtamjava.springbootdemo.dao.impl;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class JDBCConnection {
//	public Connection getConnection() {
//		final String username = "root";
//		final String password = "12345678";
//		final String url = "jdbc:mysql://localhost:3306/spring09?useTimezone=true&serverTimezone=GMT%2B7&createDatabaseIfNotExist=true";
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			return DriverManager.getConnection(url, username, password);
//		} catch (Exception e) {
//			System.out.println("Ket noi failed " + e);
//		}
//		
//		return null; 
//	}
//	
//	public static void main(String[] args) {
//		JDBCConnection jdbc = new JDBCConnection();
//		Connection conn = jdbc.getConnection();
//		if (conn == null) {
//			System.out.println("THAT BAI");
//		} else {
//			System.out.println("THANH CONG");
//		}
//	}
//}
