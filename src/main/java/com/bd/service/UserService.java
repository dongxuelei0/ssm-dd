package com.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.dao.UserDao;
import com.bd.pojo.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void test() {
        User user=userDao.getUser("aaa");
        System.out.println(user);
    }

    public List<User> findAll() {
        return  userDao.findAll();
    }
}