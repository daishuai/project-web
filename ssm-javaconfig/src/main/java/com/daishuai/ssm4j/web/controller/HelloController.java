package com.daishuai.ssm4j.web.controller;

import com.daishuai.ssm4j.domain.City;
import com.daishuai.ssm4j.web.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/11/13 21:00
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RestController
public class HelloController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/hello")
    public Object hello(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","Jack");
        return map;
    }

    @RequestMapping("/all")
    public Object getAll(){
        Map map = new HashMap();
        map.put("start", 0);
        map.put("end", 10);
        return cityService.getAll(map);
    }

    @RequestMapping(value = "/test1")
    public Object test(@RequestBody Map<String, Object> map) {
        return map;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/add")
    public Object add(@RequestBody City city) {
        int result = cityService.addCity(city);
        return result;
    }
}
