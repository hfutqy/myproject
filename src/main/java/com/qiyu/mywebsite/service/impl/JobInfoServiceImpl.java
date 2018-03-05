package com.qiyu.mywebsite.service.impl;

import com.qiyu.mywebsite.dao.JobInfoMapper;
import com.qiyu.mywebsite.service.IJobInfoService;
import com.qiyu.mywebsite.vo.DataListVo;
import com.qiyu.mywebsite.vo.QueryJobInfoListVo;

import javax.annotation.Resource;

/**
 * Created by qiyu on 2018/3/5.
 */
public class JobInfoServiceImpl implements IJobInfoService {

    @Resource
    private JobInfoMapper jobInfoMapper;

    public DataListVo queryList(QueryJobInfoListVo vo) {


        return null;
    }
}
