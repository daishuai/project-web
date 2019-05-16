package com.daishuai.consumer.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/3/7 22:33
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class FeignHeaderInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("jwt-token", "my-jwt-token");
    }
}
