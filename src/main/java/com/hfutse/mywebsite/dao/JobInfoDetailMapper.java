package com.hfutse.mywebsite.dao;

import com.hfutse.mywebsite.po.JobInfoDetailPo;

public interface JobInfoDetailMapper {
    int insert(JobInfoDetailPo record);

    int insertSelective(JobInfoDetailPo record);

    JobInfoDetailPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfoDetailPo record);

}