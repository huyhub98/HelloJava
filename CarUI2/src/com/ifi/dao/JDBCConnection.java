/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifi.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nqhuy
 */
public class JDBCConnection {

    public static void main(String[] args) {

        JDBCConnection connector = new JDBCConnection();

        if (connector != null) {
            System.out.println("Success!");
        }
    }

    public Connection getConnection() {

        try {

            final String user = "root";

            final String password = "";

            final String url = "jdbc:mysql://localhost:3306/cardb";

            Connection conn = DriverManager.getConnection(url, user, password);

            return conn;

        } catch (Exception e) {
            System.out.println("Lỗi" + e);
        }

        return null;

    }
}
