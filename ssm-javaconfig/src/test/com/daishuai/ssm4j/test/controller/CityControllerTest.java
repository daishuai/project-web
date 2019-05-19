package com.daishuai.ssm4j.test.controller;

import com.daishuai.ssm4j.web.controller.CityController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/29 17:01
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class CityControllerTest {

    @Test
    public void index() throws Exception {
        CityController controller = new CityController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/city/1")).andExpect(view().name("index"));
    }
}
