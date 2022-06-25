package org.example.notes.dao;

import org.example.notes.models.User;

import java.util.List;

public interface UserDao {
    User findByEmail(String email);

    List<User> findAll();
}
