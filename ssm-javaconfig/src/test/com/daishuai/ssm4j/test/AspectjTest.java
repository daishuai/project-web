package com.daishuai.ssm4j.test;

import com.daishuai.ssm4j.aspectj.Encoreable;
import com.daishuai.ssm4j.aspectj.Performance;
import com.daishuai.ssm4j.config.AspectjConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 10:50
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AspectjConfig.class)
public class AspectjTest {

    @Autowired
    private Performance performance;

    @Test
    public void aspectj() {
        System.out.println(performance.getClass().getName());
        performance.perform();
        ((Encoreable)performance).performEncore();
    }

}
