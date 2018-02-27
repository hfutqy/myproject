package com.qiyu.mywebsite.dao;

import com.qiyu.mywebsite.po.UserInfoPo;
import com.qiyu.mywebsite.vo.UserInfoVo;
import com.qiyu.mywebsite.vo.UserRegisterVo;

import java.util.List;

/**
 * 用户信息mapper
 */
public interface UserInfoMapper {
    UserInfoPo selectById(Integer id);

    List<UserInfoPo> selectOnCondition(UserInfoVo vo);

    Integer insertOnCondition(UserInfoVo vo);

}
