package org.example.notes.dao;

import org.example.notes.models.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User findByEmail(String email) {
        DataSource dataSource = new DataSource();
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(
                     "SELECT * FROM users WHERE user.email=\"" + email + "\";"
             );) {
            if (resultSet.next()) {
                return new User(
                        resultSet.getLong("id"),
                        resultSet.getString("email"),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("date"),
                        resultSet.getInt("role")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
