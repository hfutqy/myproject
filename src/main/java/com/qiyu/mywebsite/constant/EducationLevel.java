package com.qiyu.mywebsite.constant;

/**
 * 学历要求1中专2高中3专科4本科5硕士6博士
 * Created by qiyu on 2018/3/6.
 */
public enum EducationLevel {
    OTHER(0, "不限"),
    ZZ(1, "普通用户"),
    GZ(2, "普通用户"),
    ZK(3, "普通用户"),
    BK(4, "普通用户"),
    SS(5, "普通用户"),
    BS(6, "管理员");


    private Integer key;
    private String value;

    EducationLevel(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static String getValueByKey(int key){
        for (EducationLevel educationLevel : EducationLevel.values()) {
            if (educationLevel.getKey().equals(key)) {
                return educationLevel.getValue();
            }
        }
        return null;
    }
}
