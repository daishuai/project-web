package com.daishuai.consumer.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/3/7 22:32
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new FeignHeaderInterceptor();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
