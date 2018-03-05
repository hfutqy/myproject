package com.qiyu.mywebsite.constant;

/**
 * 工作类型
 * Created by qiyu on 2018/3/5.
 */
public enum JobType {
    ALL(0, "全部"),
    OTHERS(-1, "其他"),
    TECHNICAL(1, "技术"),
    PRODUCT(2, "产品"),
    DESIGN(3, "设计"),
    MARKET(4, "市场"),
    SALES(5, "销售"),
    ;
    private Integer key;
    private String value;

    JobType(Integer key, String value) {
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
