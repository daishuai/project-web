package com.daishuai.controller;

import com.daishuai.system.SystemContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/4/11 13:41
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private SystemContext systemContext;

    @RequestMapping("/hello")
    public String hello(Model model) {

        context.getBean("student");
        String sql = systemContext.getSqlByKey("QUERYT_NAME");
        model.addAttribute("QUERYT_NAME", sql);
        return "hello";
    }

    @RequestMapping("/index")
    public String index(Model model) {

        context.getBean("student");
        String sql = systemContext.getSqlByKey("QUERYT_NAME");
        model.addAttribute("QUERYT_NAME", sql);
        return "hello";
    }
}
