package com.qiyu.mywebsite.service.impl;

import com.qiyu.mywebsite.constant.EducationLevel;
import com.qiyu.mywebsite.constant.JobType;
import com.qiyu.mywebsite.dao.JobInfoMapper;
import com.qiyu.mywebsite.po.JobInfoPo;
import com.qiyu.mywebsite.service.IJobInfoService;
import com.qiyu.mywebsite.vo.BaseQueryVo;
import com.qiyu.mywebsite.vo.DataListVo;
import com.qiyu.mywebsite.vo.JobInfoVo;
import com.qiyu.mywebsite.vo.QueryJobInfoListVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询求职信息层实现
 * Created by qiyu on 2018/3/5.
 */
@Service
public class JobInfoServiceImpl implements IJobInfoService {

    @Resource
    private JobInfoMapper jobInfoMapper;

    public DataListVo queryList(QueryJobInfoListVo vo) {
        DataListVo dataListVo = new DataListVo();

        //获取求职信息 count、rows
        int count = jobInfoMapper.countOnCondition(vo);
        dataListVo.setCount(count);
        if (count > 0) {
            List<JobInfoPo> jobInfoPos = jobInfoMapper.selectOnCondition(vo);
            if (CollectionUtils.isNotEmpty(jobInfoPos)) {
                //整理出参给前端
                List<JobInfoVo> jobInfoVos = new ArrayList<JobInfoVo>();
                for (JobInfoPo po : jobInfoPos) {
                    JobInfoVo infoVo = new JobInfoVo();
                    BeanUtils.copyProperties(po, infoVo);
                    infoVo.setJobTypeName(JobType.getValueByKey(po.getJobType()));
                    infoVo.setEducationName(EducationLevel.getValueByKey(po.getEducation()));
                    jobInfoVos.add(infoVo);
                }
                dataListVo.setRows(jobInfoVos);
            }
        }
        return dataListVo;
    }

    public JobInfoVo queryDetail(BaseQueryVo vo) {
        JobInfoVo jobInfoVo = new JobInfoVo();
        JobInfoPo jobInfoPo = jobInfoMapper.selectByPrimaryKey(vo.getId());
        if (jobInfoPo != null) {
            BeanUtils.copyProperties(jobInfoPo, jobInfoVo);
            jobInfoVo.setJobTypeName(JobType.getValueByKey(jobInfoPo.getJobType()));
            jobInfoVo.setEducationName(EducationLevel.getValueByKey(jobInfoPo.getEducation()));
        }
        return jobInfoVo;
    }
}
