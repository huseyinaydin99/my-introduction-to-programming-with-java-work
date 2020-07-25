/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hüseyin
 */
public class DBHelper {
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "toor";
    private static final String URL = "jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    
    public Connection getConection() throws SQLException{
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }
    
    public void showErrorMessages(SQLException e){
        System.out.println("İstisna " + e.getMessage());
        System.out.println("Hata kodu " + e.getErrorCode());
    }
}
