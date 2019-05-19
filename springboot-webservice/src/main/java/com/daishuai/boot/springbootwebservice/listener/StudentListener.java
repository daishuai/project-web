package com.daishuai.boot.springbootwebservice.listener;

import com.daishuai.boot.springbootwebservice.event.StudentCreateEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/2/13 15:15
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class StudentListener implements ApplicationListener<StudentCreateEvent> {


    @Override
    public void onApplicationEvent(StudentCreateEvent event) {
        event.print();
    }
}
