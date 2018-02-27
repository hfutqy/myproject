package com.qiyu.mywebsite.vo;

/**
 * 用户注册bean
 * Created by qiyu on 2018/2/27.
 */
public class UserRegisterVo {
    private String nickName;
    private String password;
    private String passwordConfirm;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
