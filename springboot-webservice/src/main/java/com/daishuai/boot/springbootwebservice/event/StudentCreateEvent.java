package com.daishuai.boot.springbootwebservice.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/2/13 15:13
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class StudentCreateEvent extends ApplicationEvent {

    private String name;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public StudentCreateEvent(Object source) {
        super(source);
    }

    public StudentCreateEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public void print() {
        System.out.println("创建一个学生，学生名为：" + name);
    }
}
