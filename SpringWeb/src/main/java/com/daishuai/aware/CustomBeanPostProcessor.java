package com.daishuai.aware;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/4/11 14:11
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {

    private Logger logger = Logger.getLogger(CustomBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        logger.info("调用BeanPostProcessor接口实现方法postProcessBeforeInitialization()，beanName = " + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        logger.info("调用BeanPostProcessor接口实现方法postProcessAfterInitialization()，beanName = " + s);
        return o;
    }
}
