package com.hfutse.mywebsite.service.impl;

import com.hfutse.mywebsite.constant.EducationLevel;
import com.hfutse.mywebsite.po.JobInfoPo;
import com.hfutse.mywebsite.vo.*;
import com.hfutse.mywebsite.constant.JobType;
import com.hfutse.mywebsite.dao.JobInfoDetailMapper;
import com.hfutse.mywebsite.dao.JobInfoMapper;
import com.hfutse.mywebsite.po.JobInfoDetailPo;
import com.hfutse.mywebsite.service.IJobInfoService;
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
    @Resource
    private JobInfoDetailMapper jobInfoDetailMapper;

    public DataListVo queryList(QueryJobInfoListVo vo) {
        DataListVo dataListVo = new DataListVo();
        //处理全部类型的工作
        if (JobType.ALL.getKey().equals(vo.getJobType())) {
            vo.setJobType(null);
        }
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

    public JobInfoDetailVo queryDetail(BaseQueryVo vo) {
        //先查询职位基础信息
        JobInfoDetailVo jobInfoDetailVo = new JobInfoDetailVo();
        JobInfoPo jobInfoPo = jobInfoMapper.selectByPrimaryKey(vo.getId());
        if (jobInfoPo != null) {
            BeanUtils.copyProperties(jobInfoPo, jobInfoDetailVo);
            jobInfoDetailVo.setJobTypeName(JobType.getValueByKey(jobInfoPo.getJobType()));
            jobInfoDetailVo.setEducationName(EducationLevel.getValueByKey(jobInfoPo.getEducation()));
        }
        //查询职位详细信息
        JobInfoDetailPo jobInfoDetailPo = jobInfoDetailMapper.selectByPrimaryKey(vo.getId());
        if (jobInfoDetailPo != null) {
            BeanUtils.copyProperties(jobInfoDetailPo, jobInfoDetailVo);
            //还原主键id
            jobInfoDetailVo.setId(vo.getId());
        }
        return jobInfoDetailVo;
    }
}
