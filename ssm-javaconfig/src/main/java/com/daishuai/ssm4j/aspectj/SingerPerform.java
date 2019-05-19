package com.daishuai.ssm4j.aspectj;

import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 10:40
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Component
public class SingerPerform implements Performance {
    @Override
    public void perform() {
        System.out.println("演唱会！！");
    }
}
