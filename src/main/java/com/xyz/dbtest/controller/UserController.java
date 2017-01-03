package com.xyz.dbtest.controller;

import com.xyz.dbtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by xuyuzhuang on 2017/1/3.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show() {
        return userService.show();
    }

    @RequestMapping(value = "/showDao")
    @ResponseBody
    public Object showDao(int age) {
        return userService.showDao(age);
    }

    @RequestMapping(value="/insert")
    public String insert(String name, int age) {
        return userService.insert(name, age);
    }
}
