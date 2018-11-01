package com.daishuai.aware;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
    public Object postProcessBeforeInitialization(Object obj1, String s) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj1.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                logger.info("调用方法前：" + method.getName());
                Object o1 = methodProxy.invokeSuper(o, objects);
                logger.info("调用方法后：" + method.getName());
                return o1;
            }
        });
        logger.info("调用BeanPostProcessor接口实现方法postProcessBeforeInitialization()，beanName = " + s);
        return enhancer.create();
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        logger.info("调用BeanPostProcessor接口实现方法postProcessAfterInitialization()，beanName = " + s);
        return o;
    }
}
