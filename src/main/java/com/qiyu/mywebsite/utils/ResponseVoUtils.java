package com.qiyu.mywebsite.utils;

import com.qiyu.mywebsite.constant.ErrorCode;
import com.qiyu.mywebsite.vo.ResponseVo;

/**
 * 出参工具类
 * Created by qiyu on 2018/2/27.
 */
public class ResponseVoUtils {

    public static ResponseVo buildSuccessResponseVo(){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setSuccess(true);
        responseVo.setErrorCode(ErrorCode.SUCCESS.getKey());
        responseVo.setMessage(ErrorCode.SUCCESS.getValue());
        return responseVo;
    }

    public static ResponseVo buildErrorResponseVo(ErrorCode errorCode){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setSuccess(false);
        responseVo.setErrorCode(errorCode.getKey());
        responseVo.setMessage(errorCode.getValue());
        return responseVo;
    }
}
