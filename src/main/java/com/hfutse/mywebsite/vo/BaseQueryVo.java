package com.hfutse.mywebsite.vo;

/**
 * Created by qiyu on 2018/3/6.
 */
public class BaseQueryVo {
    //主键id
    private Integer id;
    //预取记录数
    private Integer limit;
    //预取记录起始位置
    private Integer start;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
