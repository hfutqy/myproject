package com.qiyu.mywebsite.service;

import com.qiyu.mywebsite.vo.UserInfoVo;

/**
 * 用户信息处理接口
 */
public interface IUserInfoService {

    UserInfoVo queryUserInfo(Integer id);

}
