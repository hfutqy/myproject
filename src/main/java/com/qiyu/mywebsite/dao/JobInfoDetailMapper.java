package com.qiyu.mywebsite.dao;

import com.qiyu.mywebsite.po.JobInfoDetailPo;

public interface JobInfoDetailMapper {
    int insert(JobInfoDetailPo record);

    int insertSelective(JobInfoDetailPo record);

    JobInfoDetailPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfoDetailPo record);

}