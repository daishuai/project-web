package com.daishuai.controller;

import com.daishuai.system.SystemContext;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 实现HttpRequestHandler接口：由HttpRequestHandlerAdapter适配器处理
 * @Author: daishuai
 * @CreateDate: 2018/10/30 14:47
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class TestController2 implements HttpRequestHandler {

    private SystemContext systemContext;

    public TestController2(SystemContext systemContext){
        this.systemContext = systemContext;
    }

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("--------------------TestController1");
        String url = request.getContextPath();
        request.setAttribute("contextPath",url);
        String sql = systemContext.getSqlByKey("QUERYT_NAME");
        request.setAttribute("QUERYT_NAME", sql);
        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request,response);

    }
}
