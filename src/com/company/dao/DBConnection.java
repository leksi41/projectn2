package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/project";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static final DBConnection INSTANCE = new DBConnection();

    private DBConnection() {
    }

    public Connection getConnection() {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            return connection;
        } catch (SQLException e) {
            System.out.println("Db not connection");
        }
        return null;
    }
}
