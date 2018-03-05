package com.qiyu.mywebsite.vo;

import java.util.List;

/**
 * 常用count/rows实体
 * Created by qiyu on 2018/3/5.
 */
public class DataListVo {

    // 总条数
    private int count;
    // 详细数据
    private List rows;

    public DataListVo() {
    }

    public DataListVo(List anonymousList) {
        this.setCount(anonymousList.size());
        this.setRows(anonymousList);
    }

    public DataListVo(int count, List anonymousList) {
        this.setCount(count);
        this.setRows(anonymousList);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
