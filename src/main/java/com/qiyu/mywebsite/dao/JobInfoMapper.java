package com.qiyu.mywebsite.dao;

import com.qiyu.mywebsite.po.JobInfoPo;

public interface JobInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobInfoPo record);

    int insertSelective(JobInfoPo record);

    JobInfoPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfoPo record);

    int updateByPrimaryKey(JobInfoPo record);
}