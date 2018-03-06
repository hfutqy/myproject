package com.qiyu.mywebsite.service;

import com.qiyu.mywebsite.vo.BaseQueryVo;
import com.qiyu.mywebsite.vo.DataListVo;
import com.qiyu.mywebsite.vo.JobInfoVo;
import com.qiyu.mywebsite.vo.QueryJobInfoListVo;

/**
 * Created by qiyu on 2018/3/4
 */
public interface IJobInfoService {
    /**
     * 列表查询
     * @param vo
     * @return
     */
    DataListVo queryList(QueryJobInfoListVo vo);

    /**
     * 列表查询
     * @param vo
     * @return
     */
    JobInfoVo queryDetail(BaseQueryVo vo);
}
