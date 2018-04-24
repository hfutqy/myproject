package com.hfutse.mywebsite.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.hfutse.mywebsite.utils.BaseRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Base64Utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * BaseController
 * Created by qiyu on 2018/2/26.
 */

public class BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    public static String getData(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BaseRestService server = new BaseRestService(request, response);
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
            response.getWriter().print(Base64Utils.encodeToString(jsonBytes));
        }catch (Exception e) {
            LOGGER.error("系统错误", e);
        }
    }

}
