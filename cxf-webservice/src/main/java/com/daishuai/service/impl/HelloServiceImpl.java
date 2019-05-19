package com.daishuai.service.impl;

import com.daishuai.service.HelloService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/11/8 15:55
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Service("helloService")
@WebService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
