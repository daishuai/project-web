package com.daishuai.ssm4j.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 10:43
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.daishuai.ssm4j.aspectj.Performance+", defaultImpl = DefaultEncoreable.class)
    public Encoreable encoreable;
}
