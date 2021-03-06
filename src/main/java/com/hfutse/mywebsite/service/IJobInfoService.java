package com.hfutse.mywebsite.service;

import com.hfutse.mywebsite.vo.BaseQueryVo;
import com.hfutse.mywebsite.vo.DataListVo;
import com.hfutse.mywebsite.vo.JobInfoDetailVo;
import com.hfutse.mywebsite.vo.QueryJobInfoListVo;

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
    JobInfoDetailVo queryDetail(BaseQueryVo vo);
}
