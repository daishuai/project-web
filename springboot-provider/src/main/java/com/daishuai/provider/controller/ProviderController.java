package com.daishuai.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/3/7 22:01
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/get")
    public Object getProvider(String name, Integer age, HttpServletRequest request) {
        String header = request.getHeader("jwt-token");
        System.out.println(header);
        Map map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("age", age);
        map.put("birthday", new Date());
        return map;
    }
}
