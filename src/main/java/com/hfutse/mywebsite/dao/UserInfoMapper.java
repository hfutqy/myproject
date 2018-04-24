package com.hfutse.mywebsite.dao;

import com.hfutse.mywebsite.po.UserInfoPo;
import com.hfutse.mywebsite.vo.UserInfoVo;

import java.util.List;

/**
 * 用户信息mapper
 */
public interface UserInfoMapper {
    UserInfoPo selectById(Integer id);

    List<UserInfoPo> selectOnCondition(UserInfoVo vo);

    Integer insertOnCondition(UserInfoVo vo);

}
