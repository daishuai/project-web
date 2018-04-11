package com.daishuai.vo;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.Date;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/4/11 14:04
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Student implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean{

    private Logger logger = Logger.getLogger(Student.class);

    private String name;
    private String sex;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("调用BeanFactoryAware接口实现方法setBeanFactory()!!!!!!!!!");
    }

    @Override
    public void setBeanName(String s) {
        logger.info("调用BeanNameAware接口实现方法setBeanName()!!!!!!!!!");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("调用DisposableBean接口实现方法destroy()!!!!!!!!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("调用InitializingBean接口实现方法afterPropertiesSet()!!!!!!!!!");
    }

    public void initMethod(){
        logger.info("调用Student初始化方法initMethod()!!!!!!!!!");
    }

    public void destroyMethod(){
        logger.info("调用Student销毁方法destroyMethod()!!!!!!!!!");
    }
}
