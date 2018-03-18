package com.qiyu.mywebsite.utils;

import com.qiyu.mywebsite.constant.BaseConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * rest
 * Created by qiyu on 2018/2/26.
 */
public class BaseRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseRestService.class);


    private HttpServletRequest request;
    private HttpServletResponse response;

    public BaseRestService(HttpServletRequest req, HttpServletResponse resp) {
        this.request = req;
        this.response = resp;
    }

    public String getRestData() throws IOException {
        if (null == this.request) {
            return null;
        } else {
            String method = this.request.getMethod();
            String ret;
            if (!method.equalsIgnoreCase("GET") && !method.equalsIgnoreCase("DELETE")) {
                ret = this.getBodyData();
            } else {
                ret = this.request.getQueryString();
            }
            if (!StringUtils.isEmpty(ret)) {
                String result = ret.replace("data=", "");
                //处理URLEncoder数据
                result = URLDecoder.decode(result, BaseConstants.UTF_8);
                return new String(Base64Utils.decodeFromString(result));
            } else {

                return null;
            }

        }
    }


    private String getBodyData() {
        StringBuilder data = new StringBuilder();
        try {
            BufferedReader reader = this.request.getReader();
            String line = reader.readLine();
            while (null != line) {
                data.append(line);
            }
        } catch (IOException var8) {
            LOGGER.error(var8.getMessage(), var8.getCause());
        }
        return data.toString();
    }
}
