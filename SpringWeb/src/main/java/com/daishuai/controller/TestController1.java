package com.daishuai.controller;

import com.daishuai.system.SystemContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 实现Controller接口：由SimpleControllerHandlerAdapter适配器执行
 * @Author: daishuai
 * @CreateDate: 2018/10/30 14:47
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class TestController1 implements Controller {

    private SystemContext systemContext;

    public TestController1(SystemContext systemContext){
        this.systemContext = systemContext;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("QUERYT_NAME",systemContext.getSqlByKey("QUERYT_NAME"));
        return modelAndView;
    }
}
