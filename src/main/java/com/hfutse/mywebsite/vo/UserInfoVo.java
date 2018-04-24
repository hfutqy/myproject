package com.hfutse.mywebsite.vo;

/**
 * 数据传输层bean
 * userINfo
 */
public class UserInfoVo extends BaseVo{
    private int id;
    private String nickName;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
