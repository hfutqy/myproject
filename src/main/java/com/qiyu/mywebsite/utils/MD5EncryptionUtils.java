package com.qiyu.mywebsite.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

/**
 * md5加密功能
 * Created by qiyu on 2018/2/27.
 */
public class MD5EncryptionUtils {
    /**
     * ND5工具类日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(MD5EncryptionUtils.class);

    /***
     * MD5加码 生成32位md5码
     */
    public static String string2MD5(String inStr) {
        //加密盐qiyu
        String str =inStr + "qiyu";
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            LOGGER.error("MD5Util exception:", e);
            return "";
        }
        char[] charArray = str.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuilder hexValue = new StringBuilder();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
}