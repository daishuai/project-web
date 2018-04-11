package com.daishuai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/4/11 13:41
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Controller
public class HelloController {
    @Autowired
    private ApplicationContext context;

    @RequestMapping("/hello")
    public String hello() {

        context.getBean("student");

        return "hello";
    }
}
