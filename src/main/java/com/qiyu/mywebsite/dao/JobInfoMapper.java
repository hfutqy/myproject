package com.qiyu.mywebsite.dao;

import com.qiyu.mywebsite.po.JobInfoPo;
import com.qiyu.mywebsite.vo.QueryJobInfoListVo;

import java.util.List;

public interface JobInfoMapper {

    int insertSelective(JobInfoPo record);

    JobInfoPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfoPo record);

    int countOnCondition(QueryJobInfoListVo queryVo);

    List<JobInfoPo> selectOnCondition(QueryJobInfoListVo queryVo);

}