package com.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bd.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public ModelAndView test1() {
        System.out.println("this is userTest");
        userService.test();
        return null;
    }
}