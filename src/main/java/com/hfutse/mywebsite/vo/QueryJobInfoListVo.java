package com.hfutse.mywebsite.vo;

/**
 * 查询入参
 * Created by qiyu on 2018/3/5.
 */
public class QueryJobInfoListVo extends BaseQueryVo{
    private Integer JobType;

    public Integer getJobType() {
        return JobType;
    }

    public void setJobType(Integer jobType) {
        JobType = jobType;
    }
}
