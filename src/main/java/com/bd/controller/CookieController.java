package com.bd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/coo")
@Controller
public class CookieController {

    @RequestMapping("/test")
    public String testCookie(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie =new Cookie("msg","leilei");
        response.addCookie(cookie);
        return null;

    }

    @RequestMapping("/qu")
    public String quCookie(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String value = cookie.getValue();
            System.out.println(value);
        }
        return null;
    }





}
