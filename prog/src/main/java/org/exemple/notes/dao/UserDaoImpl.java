package org.exemple.notes.dao;

import org.exemple.notes.entity.User;
import org.exemple.notes.repository.UserDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImpl implements UserDao {
    @Override
    public User findUserByEmail(String email) throws SQLException {
        DataSource dataSource = new DataSource();
        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("""
                    SELECT * FROM user WHERE eser.email="" 
                    """);
            if (resultSet.next()) {
                return new User(
                        resultSet.getLong("ID"),
                        resultSet.getString("NAME"),
                        resultSet.getString("EMAIL"),
                        resultSet.getString("PASS"),
                        resultSet.getString("REPASS")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

        return null;
    }

    @Override
    public User saveUser(String name, String email, String pass, String repass) throws SQLException {
        DataSource dataSource = new DataSource();
        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            statement.execute("""
                    INSERT INTO user (NAME, EMAIL, PASS, REPASS) VALUE (name, email, pass, repass)
                    """);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }
}
