package org.exemple.notes.dao;

import org.exemple.notes.entity.User;
import org.exemple.notes.repository.UserDao;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    @Override
    public User findUserByEmail(String email) throws SQLException {
        DataSource dataSource = new DataSource();
        Connection connection = dataSource.createConnection();
        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("""
                    SELECT * FROM user WHERE eser.email=email; 
                    """);
            if (resultSet.next()) {
                return new User(
                        resultSet.getLong("ID"),
                        resultSet.getString("NAME"),
                        resultSet.getString("EMAIL"),
                        resultSet.getString("PASS")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

        return null;
    }

    @Override
    public User saveUser(User user) throws SQLException {
        DataSource dataSource = new DataSource();
        Connection connection = dataSource.createConnection();

        try {
            if (user == null) {
                PreparedStatement preparedStatement = connection.prepareStatement("""
                    INSERT INTO user (NAME, EMAIL, PASS) VALUES (?, ?, ?)
                    """);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPass());
            preparedStatement.executeQuery();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        finally {
//            connection.close();
//
//
//        }

        return user;
    }
}
