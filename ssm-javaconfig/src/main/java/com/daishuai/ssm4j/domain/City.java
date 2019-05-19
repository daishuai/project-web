package com.daishuai.ssm4j.domain;


/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/11/13 21:02
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class City {

    private Integer id;

    private String name;

    private String countryCode;

    private String district;

    private Integer population;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
