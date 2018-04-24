package com.hfutse.mywebsite.dao;

import com.hfutse.mywebsite.po.JobInfoPo;
import com.hfutse.mywebsite.vo.QueryJobInfoListVo;

import java.util.List;

public interface JobInfoMapper {

    int insertSelective(JobInfoPo record);

    JobInfoPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfoPo record);

    int countOnCondition(QueryJobInfoListVo queryVo);

    List<JobInfoPo> selectOnCondition(QueryJobInfoListVo queryVo);

}