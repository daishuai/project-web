package com.daishuai.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/3/7 22:00
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@EnableFeignClients
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
