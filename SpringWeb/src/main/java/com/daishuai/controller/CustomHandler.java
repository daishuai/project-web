package com.daishuai.controller;

import com.daishuai.system.SystemContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/10/30 12:03
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class CustomHandler implements Controller {

    //@Autowired
    private SystemContext systemContext;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("QUERYT_NAME",systemContext.getSqlByKey("QUERYT_NAME"));
        return modelAndView;
    }

    public SystemContext getSystemContext() {
        return systemContext;
    }

    public void setSystemContext(SystemContext systemContext) {
        this.systemContext = systemContext;
    }
}
