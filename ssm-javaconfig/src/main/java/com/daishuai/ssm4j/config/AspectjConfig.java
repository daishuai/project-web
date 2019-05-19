package com.daishuai.ssm4j.config;

import com.daishuai.ssm4j.aspectj.CriticAspect;
import com.daishuai.ssm4j.aspectj.CriticismEngine;
import com.daishuai.ssm4j.aspectj.EncoreableIntroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 10:42
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Configuration
@ComponentScan("com.daishuai.ssm4j.aspectj")
@EnableAspectJAutoProxy
public class AspectjConfig {

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }

    @Bean
    public CriticAspect criticAspect(CriticismEngine criticismEngine) {
        CriticAspect criticAspect = CriticAspect.aspectOf();
        criticAspect.setCriticismEngine(criticismEngine);
        return criticAspect;
    }

}
