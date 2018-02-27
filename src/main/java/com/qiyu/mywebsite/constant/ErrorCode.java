package com.qiyu.mywebsite.constant;

/**
 * 错误码
 * Created by qiyu on 2018/2/27.
 */
public enum ErrorCode {
    SUCCESS(10000, "成功"),
    SYSTEM_ERROR(10001, "系统错误"),
    PARAM_ERROR(10002, "参数非法"),
    NICKNAME_OCCUPIED(10003, "该昵称已被注册"),
    ;

    private int key;
    private String value;
    public int getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
    ErrorCode(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
