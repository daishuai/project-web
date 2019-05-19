package com.daishuai.ssm.mapper;

import com.daishuai.ssm.vo.City;

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

    List<City> findAll(Map map);
}
