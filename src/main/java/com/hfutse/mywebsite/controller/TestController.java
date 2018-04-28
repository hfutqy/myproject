package com.hfutse.mywebsite.controller;

import com.hfutse.mywebsite.utils.ResponseVoUtils;
import com.hfutse.mywebsite.vo.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * test controller
 * Created by qiyu on 2018/4/24.
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test(HttpServletRequest request, HttpServletResponse response) {
        String a = "\u5173\u4e8e\u9648\u4e16\u5b8f\u3001\u5f20\u7fbd\u7684\u4eba\u4e8b\u4efb\u514d\u53ca\u6c47\u62a5\u5173\u7cfb\u8c03\u6574\u7684\u51b3\u5b9a";
        Map<String, String> xxx = new HashMap<String, String>();
        xxx.put("key", a);
        ResponseVo vo = ResponseVoUtils.buildSuccessResponseVo(xxx);
        this.sendData(response, vo);
    }


    public static void main(String[] args) throws Exception {

        String a = "123";
        String b = "123";
        List<String> aList = new ArrayList<String>();
        aList.add(a);
        List<String> bList = new ArrayList<String>();
        bList.add(b);
        System.out.println(aList.hashCode() == bList.hashCode());
        System.out.println(aList.equals(bList));

        Map<Integer, Integer> aMap = new HashMap<Integer, Integer>();
        aMap.put(1, 2);

        Integer xxxa = 12;
        change(aList);
        System.out.println(aList);

    }

    static void change(List a) {
        a.add(12);
    }

    /**
     * 文件copy方法
     *
     * @param source
     * @param dest
     * @throws IOException
     */
    private static void copyFile1(File source, File dest)
            throws IOException {
        FileCopyUtils.copy(source, dest);
    }

    private static void copyFile2(File source, File dest)
            throws IOException {
        FileInputStream fileInputStream = new FileInputStream(source);
        FileInputStream fileInputStreamDest = new FileInputStream(dest);
        try {
            FileChannel inputChannel = fileInputStream.getChannel();
            FileChannel outputChannel = fileInputStreamDest.getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (IOException e) {
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
            }
            try {
                fileInputStreamDest.close();
            } catch (IOException e) {
            }
        }
    }

    private static void copyFile3(File source, File dest)
            throws IOException {
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(dest);
        StreamUtils.copy(in, out);
    }
}