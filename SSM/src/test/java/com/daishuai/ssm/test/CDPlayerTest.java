package com.daishuai.ssm.test;

import com.daishuai.ssm.config.CDPlayerConfig;
import com.daishuai.ssm.domain.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/20 17:01
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
    }
}
