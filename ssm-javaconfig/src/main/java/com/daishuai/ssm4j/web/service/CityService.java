package com.daishuai.ssm4j.web.service;

import com.daishuai.ssm4j.domain.City;
import com.daishuai.ssm4j.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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


    public List<City> getAll(Map map){
        //List<City> cities = (List<City>) redisTemplate.opsForValue().get("citys");
        //if (cities == null) {
        List<City> cities = cityMapper.findAll(map);
            System.out.println("查询数据库");
            //redisTemplate.opsForValue().set("citys", cities);
        //}

        return cities;
    }

    public int addCity(City city) {
        int reuslt = cityMapper.addCity(city);
        int i = 1/0;
        return reuslt;
    }

    public int addTest(Map test) {
        int result = cityMapper.addTest(test);
        int i = 1/0;
        return result;
    }


    public City findCity(Integer id) {
        return cityMapper.findCityById(id);
    }
}
