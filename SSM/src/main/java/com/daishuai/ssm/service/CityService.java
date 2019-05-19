package com.daishuai.ssm.service;

import com.daishuai.ssm.mapper.CityMapper;
import com.daishuai.ssm.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/11/13 21:20
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    public List<City> getAll(Map map){
        List<City> cities = (List<City>) redisTemplate.opsForValue().get("citys");
        if (cities == null) {
            cities = cityMapper.findAll(map);
            System.out.println("查询数据库");
            redisTemplate.opsForValue().set("citys", cities);
        }

        return cities;
    }
}
