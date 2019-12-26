package com.bd.dao;

import com.bd.pojo.User;

import java.util.List;

public interface UserDao {
    User getUser(String username);

    List<User> findAll();
}