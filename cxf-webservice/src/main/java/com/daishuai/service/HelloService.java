package com.daishuai.service;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/11/8 15:53
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@WebService(targetNamespace = "http://service.com", serviceName = "helloService")
public interface HelloService {

    @WebMethod
    //@WebResult(partName = "1111", name = "2222")
    String sayHello();
}
