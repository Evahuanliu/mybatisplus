package com.demo.mybatisplus.controller;

import com.demo.mybatisplus.pojo.User;
import com.demo.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController2 {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> listUser(){
        return userService.listUser();
    }
}
