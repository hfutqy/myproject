package com.qiyu.mywebsite.dao;

import com.qiyu.mywebsite.po.UserInfoPo;

/**
 * 用户信息mapper
 */
public interface UserInfoMapper {
    UserInfoPo selectById(Integer id);
}
