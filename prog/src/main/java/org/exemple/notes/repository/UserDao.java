package org.exemple.notes.repository;

import org.exemple.notes.entity.User;

import java.sql.SQLException;

public interface UserDao {
    User findUserByEmail(String email) throws SQLException;
    User saveUser(User user) throws SQLException;
}
