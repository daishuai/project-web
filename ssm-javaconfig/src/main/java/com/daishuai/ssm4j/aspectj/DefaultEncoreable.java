package com.daishuai.ssm4j.aspectj;

import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 10:44
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Component
public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("歌手返场");
    }
}
