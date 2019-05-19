package com.daishuai.ssm4j.domain;

/**
 * @Description: 封装返回结果
 * @Author: daishuai
 * @CreateDate: 2019/2/14 14:44
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class RespResult {

    private String code;

    private String message;

    private Object data;

    public RespResult() {}

    public RespResult(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static RespResult error(Object data) {
        return new RespResult("1111", "处理失败", data);
    }

    public static RespResult success(Object data) {
        return new RespResult("0000", "处理成功", data);
    }
}
