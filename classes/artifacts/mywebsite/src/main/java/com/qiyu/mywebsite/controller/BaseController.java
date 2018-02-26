package com.qiyu.mywebsite.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.qiyu.mywebsite.base.RestServer;
import com.qiyu.mywebsite.constant.Constant;
import com.qiyu.mywebsite.service.IUserInfoService;
import com.qiyu.mywebsite.vo.ResponseVo;
import com.qiyu.mywebsite.vo.UserInfoVo;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * BaseController
 * Created by qiyu on 2018/2/26.
 */

public class BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    public static String getData(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RestServer server = new RestServer(request, response);
        String data = server.getRestData();
        LOGGER.info("{}?{}", request.getRequestURL(), data);
        return data;
    }

    public void sendData(HttpServletResponse response, Object object) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Methods", "*");

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            byte[] jsonBytes = objectMapper.writeValueAsBytes(object);
            response.getWriter().print(Base64.encodeBase64String(jsonBytes));
        }catch (Exception e) {
            LOGGER.error("系统错误", e);
        }
    }


    public <T> T toBean(Object ro, Class<T> tClass) {
        JSONObject jsonObject = JSONObject.fromObject(ro);
        return (T) JSONObject.toBean(jsonObject, tClass);
    }
}
