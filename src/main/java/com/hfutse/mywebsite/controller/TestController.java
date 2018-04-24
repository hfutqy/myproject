package com.hfutse.mywebsite.controller;

import ch.qos.logback.core.util.FileUtil;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * test controller
 * Created by qiyu on 2018/4/24.
 */
public class TestController {
    public static void main(String[] args) throws Exception{
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
//        copyFileUsingApacheCommonsIO(file, fileEnd);

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
