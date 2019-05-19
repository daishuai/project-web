package com.daishuai.ssm4j.aspectj;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 11:33
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public aspect CriticAspect {

    public CriticAspect() {}

    private CriticismEngine criticismEngine;

    public CriticismEngine getCriticismEngine() {
        return criticismEngine;
    }

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

    pointcut performance() : execution(* com.daishuai.ssm4j.aspectj.Performance.perform(..));

    after() : performance() {
        System.out.println(criticismEngine.getCriticism());
    }


}
