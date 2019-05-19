package com.daishuai.ssm.aspect;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/18 16:12
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class LogAspect {

    public void beforeMethod() {
        System.out.println("开始执行方法");
    }

    public void afterMethod() {
        System.out.println("方法执行结束");
    }
}
