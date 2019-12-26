package com.bd.service;



import com.alibaba.fastjson.JSONObject;
import com.bd.youdao.Language;
import com.bd.youdao.Web;
import com.bd.youdao.Youdao;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONString;
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

    public void insertYouDao(Language youdao) {

       userDao.insertYouDao(youdao);


    }
}