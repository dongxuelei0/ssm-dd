package com.bd.dao;

import com.bd.pojo.User;

public interface UserDao {
    User getUser(String username);
}