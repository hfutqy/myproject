package com.qiyu.mywebsite.utils;

import com.alibaba.fastjson.util.Base64;
import org.springframework.util.Base64Utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * rest
 * Created by qiyu on 2018/2/26.
 */
public class BaseRestService {
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
            return null == ret ? null : new String(Base64Utils.decodeFromString(ret));
        }
    }

    private String getBodyData() throws IOException {
        StringBuilder data = new StringBuilder();
        try {
            BufferedReader reader = this.request.getReader();
            String line = reader.readLine();
            while (null != line) {
                data.append(line);
            }
        } catch (IOException var8) {
            throw new IOException(var8.getMessage(), var8.getCause());
        }
        return data.toString();
    }
}
