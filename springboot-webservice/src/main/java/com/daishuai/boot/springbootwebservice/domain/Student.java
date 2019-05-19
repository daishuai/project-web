package com.daishuai.boot.springbootwebservice.domain;

import com.daishuai.boot.springbootwebservice.event.StudentCreateEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/2/13 15:27
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class Student implements ApplicationContextAware {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.publishEvent(new StudentCreateEvent(new Object(), name));
    }
}
