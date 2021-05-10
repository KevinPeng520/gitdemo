package com.example.gitdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/getData")
    public String getMethod(){
        log.info("获取到了数据");
        return "获取到了数据";
    }
}
