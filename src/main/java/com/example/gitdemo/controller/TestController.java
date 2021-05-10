package com.example.gitdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {

    @RequestMapping("/getData")
    public String getMethod(){
        return "获取到了数据";
    }
}
