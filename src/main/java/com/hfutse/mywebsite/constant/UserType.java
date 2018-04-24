package com.hfutse.mywebsite.constant;

public enum UserType {
    USER(0, "普通用户"),
    ADMIN(1, "管理员");


    private Integer key;
    private String value;

    UserType(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
