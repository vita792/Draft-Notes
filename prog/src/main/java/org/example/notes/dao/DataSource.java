package org.example.notes.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {

    Connection connection = null;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/secret_notes?users=root&password=root";

    public DataSource() {
        try {
            Class.forName(JDBC_DRIVER).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Connection createConnection() {
        Connection connectionCreate = null;
        try {
            if (connection != null) {
                System.out.println("Connection already created");
            } else {
                connectionCreate = DriverManager.getConnection(DB_URL);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connectionCreate;
    }

}
