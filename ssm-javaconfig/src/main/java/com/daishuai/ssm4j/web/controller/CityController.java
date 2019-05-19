package com.daishuai.ssm4j.web.controller;

import com.daishuai.ssm4j.domain.City;
import com.daishuai.ssm4j.web.service.CityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 16:57
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;


    @RequestMapping("/{id:\\d+}")
    public String city(@PathVariable Integer id, Model model) {
        City city = cityService.findCity(id);
        model.addAttribute(city);
        return "index";
    }
}
