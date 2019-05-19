package com.daishuai.ssm4j.aspectj;

import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 11:42
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Component
public class CriticismEngineImpl implements CriticismEngine {

    @Override
    public String getCriticism() {
        return "我肯能走进错误的片场了";
    }
}
