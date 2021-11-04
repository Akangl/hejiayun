package com.study.family_service_platform.returnJson;

import lombok.Data;

/**
 * @author Wenkang.Zhou
 * @date 2021-09-13 20:49
 * @description 参数返回工具类
 */
@Data
public class ReturnObject {

    private Integer code = 200;

    private String message = "success";

    private Object result;

    public ReturnObject(Object result) {
        this.result = result;
    }

}
