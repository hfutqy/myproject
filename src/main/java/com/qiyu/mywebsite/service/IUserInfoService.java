package com.qiyu.mywebsite.service;

import com.qiyu.mywebsite.vo.ResponseVo;
import com.qiyu.mywebsite.vo.UserInfoVo;
import com.qiyu.mywebsite.vo.UserRegisterVo;

/**
 * 用户信息处理接口
 */
public interface IUserInfoService {

    /**
     * 根据id查询用户信息
     */
    UserInfoVo queryUserInfo(Integer id);

    /**
     * 注册
     */
    ResponseVo register(UserRegisterVo vo);


    /**
     * 登陆
     */
    ResponseVo sign(UserInfoVo vo);
}
