package com.hfutse.mywebsite.controller;

import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.util.FileUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hfutse.mywebsite.utils.ResponseVoUtils;
import com.hfutse.mywebsite.vo.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.nio.cs.UnicodeEncoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.CoderResult;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * test controller
 * Created by qiyu on 2018/4/24.
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController{


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test(HttpServletRequest request, HttpServletResponse response) {
        String a = "\u5173\u4e8e\u9648\u4e16\u5b8f\u3001\u5f20\u7fbd\u7684\u4eba\u4e8b\u4efb\u514d\u53ca\u6c47\u62a5\u5173\u7cfb\u8c03\u6574\u7684\u51b3\u5b9a";
        Map<String, String> xxx = new HashMap<String, String>();
        xxx.put("key", a);
        ResponseVo vo = ResponseVoUtils.buildSuccessResponseVo(xxx);
        this.sendData(response, vo);
    }



    public static void main(String[] args) throws Exception{
        //方法一
        File file = new File("E:\\var\\test.txt");
        File fileEnd = new File("E:\\var\\log\\test.txt");
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(file).getChannel();
            outputChannel = new FileOutputStream(fileEnd).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            inputChannel.close();
            outputChannel.close();
        }
        //方法二
        copyFileUsingApacheCommonsIO(file, fileEnd);
        String str = "";
        StringBuffer a = new StringBuffer("");
        StringBuilder aaaa = new StringBuilder("");
        List<InputStream> xx = new LinkedList<InputStream>();
    }

    /**
     * 文件copy方法
     * @param source
     * @param dest
     * @throws IOException
     */
    private static void copyFileUsingApacheCommonsIO(File source, File dest)
            throws IOException {
        FileCopyUtils.copy(source, dest);
    }
}
