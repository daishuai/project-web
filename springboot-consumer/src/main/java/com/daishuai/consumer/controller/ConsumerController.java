package com.daishuai.consumer.controller;

import com.daishuai.consumer.feign.RemoteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.rmi.server.RemoteServer;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/3/7 22:11
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RemoteInterface remoteInterface;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public Object getConsumer(String name) {
        return remoteInterface.getProvider(name);
    }

    @GetMapping("/gets")
    public Object getConsumer(@RequestParam Map<String, Object> params) {
        String name = (String) params.get("name");

        //header
        HttpHeaders headers = new HttpHeaders();
        headers.add("jwt-token", "restTemplate-jwt-token");
        HttpEntity httpEntity = new HttpEntity(null, headers);
        ResponseEntity<Object> exchange = restTemplate.exchange("http://localhost:8082/provider/get?name=" + name, HttpMethod.GET, httpEntity, Object.class);
        //Object pro = remoteInterface.getProvider(params);
        return exchange;
    }

}
