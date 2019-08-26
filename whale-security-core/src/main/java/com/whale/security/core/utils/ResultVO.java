package com.whale.security.core.utils;


import com.whale.security.core.common.domain.SimpleResponse;

import java.util.Map;

/**
 * @ClassName ResultUtil
 * @Description 统一返回工具类
 * @Author like
 * @Data 2018/11/10 16:24
 * @Version 1.0
 **/

public class ResultVO {

    /**
     * 执行成功 code 200
     *
     * @param msg
     * @param object
     * @param token
     * @return
     */
    public static SimpleResponse success(String msg, Object object, Map<String, Object> token) {

        SimpleResponse responseBean = new SimpleResponse();
        responseBean.setCode(200);
        responseBean.setMsg(msg);
        responseBean.setData(object);
        responseBean.setToken(token);
        return responseBean;
    }

    /**
     * 失败 code 自定义
     *
     * @param code
     * @param msg
     * @param object
     * @param token
     * @return
     */
    public static SimpleResponse error(Integer code, String msg, Object object, Map<String, Object> token) {

        SimpleResponse responseBean = new SimpleResponse();
        responseBean.setCode(code);
        responseBean.setMsg(msg);
        responseBean.setData(object);
        responseBean.setToken(token);
        return responseBean;
    }

    /**
     * 失败 code 自定义 无data
     *
     * @param code
     * @param msg
     * @param token
     * @return
     */
    public static SimpleResponse error(Integer code, String msg, Map<String, Object> token) {

        return ResultVO.error(code, msg, null, token);
    }
}
