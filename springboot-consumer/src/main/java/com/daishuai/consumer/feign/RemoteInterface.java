package com.daishuai.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/3/7 22:13
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@FeignClient(name = "provider", url = "http://localhost:8082/provider")
public interface RemoteInterface {

    /**
     * 远程调用
     * @param name
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    Object getProvider(@RequestParam("name") String name);

    /**
     * 远程调用
     * @param params
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    Object getProvider(@RequestParam Map<String, Object> params);
}
