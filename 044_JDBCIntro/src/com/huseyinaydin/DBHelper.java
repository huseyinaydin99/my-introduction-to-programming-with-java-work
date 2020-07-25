package com.huseyinaydin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "toor";
    private static final String URL = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }

    public void showErrorMessage(SQLException e){
        System.out.println("İstisna " + e.getMessage());
        System.out.println("Error code " + e.getErrorCode());
    }
}
