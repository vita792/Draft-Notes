package org.exemple.notes.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    Connection connection = null;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/user?user=root2&password=root?useSSL=false&serverTimezone=UTC";

    public DataSource() {
        try {
            Class.forName(JDBC_DRIVER).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection createConnection() {
        Connection connect = null;
        try {
            if (connection != null) {
                System.out.println("Can`t create new connection!");
            } else {
                connect = DriverManager.getConnection(DB_URL);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return connect;
    }
}