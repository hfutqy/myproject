package com.hfutse.mywebsite.constant;

/**
 * 学历要求1中专2高中3专科4本科5硕士6博士
 * Created by qiyu on 2018/3/6.
 */
public enum EducationLevel {
    OTHER(0, "不限"),
    ZZ(1, "中专"),
    GZ(2, "高中"),
    ZK(3, "专科"),
    BK(4, "本科"),
    SS(5, "硕士"),
    BS(6, "博士");


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
