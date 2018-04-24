package com.hfutse.mywebsite.service.impl;

import com.hfutse.mywebsite.service.IUserInfoService;
import com.hfutse.mywebsite.utils.MD5EncryptionUtils;
import com.hfutse.mywebsite.utils.ResponseVoUtils;
import com.hfutse.mywebsite.vo.ResponseVo;
import com.hfutse.mywebsite.vo.UserInfoVo;
import com.hfutse.mywebsite.vo.UserRegisterVo;
import com.hfutse.mywebsite.constant.BaseErrorCode;
import com.hfutse.mywebsite.dao.UserInfoMapper;
import com.hfutse.mywebsite.po.UserInfoPo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public ResponseVo register(UserRegisterVo vo) {
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setNickName(vo.getNickName());
        List<UserInfoPo> userInfoPos = userInfoMapper.selectOnCondition(userInfoVo);
        if (CollectionUtils.isNotEmpty(userInfoPos)) {
            return ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.NICKNAME_OCCUPIED);
        }
        //密码加密处理
        userInfoVo.setPassword(MD5EncryptionUtils.string2MD5(vo.getPassword()));
        Integer newId = userInfoMapper.insertOnCondition(userInfoVo);
        return ResponseVoUtils.buildSuccessResponseVo(newId);
    }

    public ResponseVo sign(UserInfoVo vo) {
        ResponseVo responseVo = ResponseVoUtils.buildSuccessResponseVo(null);


        return responseVo;
    }
}
