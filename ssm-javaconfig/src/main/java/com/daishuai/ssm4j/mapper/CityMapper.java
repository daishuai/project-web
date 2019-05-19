package com.daishuai.ssm4j.mapper;


import com.daishuai.ssm4j.domain.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/11/13 21:18
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public interface CityMapper {

    /**
     * 分页查询城市
     * @param map
     * @return
     */
    @Select("SELECT * FROM city LIMIT #{start}, #{end}")
    List<City> findAll(Map map);

    /**
     * 新增
     * @param city
     * @return
     */
    @Insert("INSERT INTO CITY (id,name,countryCode,district,population) VALUES (#{id},#{name},#{countryCode},#{district},#{population})")
    int addCity(City city);

    /**
     * 新增
     * @param test
     * @return
     */
    @Insert("INSERT INTO test (id, name) VALUES (#{id},#{name})")
    int addTest(Map test);

    /**
     * 根据id查询城市
     * @param id
     * @return
     */
    @Select("SELECT * FROM city WHERE id = #{id}")
    City findCityById(Integer id);
}
