package com.bd.dao;

import com.bd.pojo.User;
import com.bd.youdao.Language;
import com.bd.youdao.Youdao;

import java.util.List;

public interface UserDao {
    User getUser(String username);

    List<User> findAll();

    void insertYouDao(Language youdao);
}