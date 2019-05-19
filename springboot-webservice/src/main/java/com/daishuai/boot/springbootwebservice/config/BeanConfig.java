package com.daishuai.boot.springbootwebservice.config;

import com.daishuai.boot.springbootwebservice.domain.Student;
import com.daishuai.boot.springbootwebservice.listener.StudentListener;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/2/13 15:31
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Configuration
public class BeanConfig {

    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("zhangsan");
        return student;
    }

    @Bean
    public ApplicationListener studentListener() {
        return new StudentListener();
    }
}
