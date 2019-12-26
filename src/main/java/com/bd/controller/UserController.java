package com.bd.controller;

import com.bd.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bd.service.UserService;

import java.util.List;

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

    //sulin

    /**
     *
     * @param page 页面     默认在第一页
     * @param size 数据条数 默认为条数据
     * @return
     */
    @RequestMapping("findAll.do")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "5") int size) {



        PageHelper.startPage(pageNum, size);   //第一个参数代表当前页码  第二个参数代表每页多少条记录数
        List<User> list = userService.findAll();
        PageInfo<User> page = new PageInfo<User>(list);
        System.out.println("总数量：" + page.getTotal());
        System.out.println("当前页查询记录：" + page.getList().size());
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页显示数量：" + page.getPageSize());
        System.out.println("总页：" + page.getPages());
        return null;
    }

}