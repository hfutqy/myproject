package com.qiyu.mywebsite.base;


import com.qiyu.mywebsite.constant.Constant;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * rest加解密
 * Created by qiyu on 2018/2/26.
 */
class RestCodec {
    RestCodec() {
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(RestCodec.class);

    static String decodeData(String base64Data){
        try {
            return new String(Base64.decodeBase64(base64Data.getBytes(Constant.UTF_8)), Constant.UTF_8);
        } catch (Exception e) {
            LOGGER.error("error in decodeDate"+base64Data, e);
            return null;
        }
    }

    static String encodeData(String binaryData) {
        try {
            if(null == binaryData) {
                return null;
            } else {
                return Base64.encodeBase64String(binaryData.getBytes(Constant.UTF_8));
            }
        } catch (Exception e) {
            LOGGER.error("error in decodeDate"+binaryData, e);
            return null;
        }
    }
}
