package com.huseyinaydin;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            deleteData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void deleteData() throws SQLException{
        DBHelper dbHelper = new DBHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "delete from city where id=?;";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4080);
            int result = statement.executeUpdate();
            System.out.println(result);
            System.out.println("Silme işlemi başarı ile yapıldı");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void updateData() throws SQLException{
        DBHelper dbHelper = new DBHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "update city set population=80000,district='duzce' where id=?;";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4080);
            int result = statement.executeUpdate();
            System.out.println(result);
            System.out.println("Güncelleme yapıldı");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void insertData() throws SQLException{
        DBHelper dbHelper = new DBHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "insert into city(Name,CountryCode,District,Population) values(?,?,?,?);";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Duzce");
            statement.setString(2,"TUR");
            statement.setString(3,"Duzce");
            statement.setInt(4,50000);
            int result = statement.executeUpdate();
            System.out.println(result);
            System.out.println("Kayıt yapıldı");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void selectDemo() throws SQLException{
        DBHelper dbHelper = new DBHelper();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country;");
            ArrayList<Country> countries = new ArrayList<>();
            while (resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")
                ));
            }
            System.out.println("Bağlatı başarılı");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
