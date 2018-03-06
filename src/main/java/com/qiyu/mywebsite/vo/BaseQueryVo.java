package com.qiyu.mywebsite.vo;

/**
 * Created by qiyu on 2018/3/6.
 */
public class BaseQueryVo {
    //预取记录数
    private Integer limit;
    //预取记录起始位置
    private Integer start;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
