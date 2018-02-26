package com.qiyu.mywebsite.service.impl;

import com.qiyu.mywebsite.dao.UserInfoMapper;
import com.qiyu.mywebsite.po.UserInfoPo;
import com.qiyu.mywebsite.service.IUserInfoService;
import com.qiyu.mywebsite.vo.UserInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户信息逻辑实现层
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;


    public UserInfoVo queryUserInfo(Integer id) {
        UserInfoPo userInfoPo = userInfoMapper.selectById(id);
        UserInfoVo userInfoVo = new UserInfoVo();
        BeanUtils.copyProperties(userInfoPo,userInfoVo);
        return userInfoVo;
    }
}
