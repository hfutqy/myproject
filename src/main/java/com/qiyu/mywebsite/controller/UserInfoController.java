package com.qiyu.mywebsite.controller;

import com.alibaba.fastjson.JSON;
import com.qiyu.mywebsite.constant.BaseErrorCode;
import com.qiyu.mywebsite.service.IUserInfoService;
import com.qiyu.mywebsite.utils.ResponseVoUtils;
import com.qiyu.mywebsite.vo.ResponseVo;
import com.qiyu.mywebsite.vo.UserInfoVo;
import com.qiyu.mywebsite.vo.UserRegisterVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户中心controller
 */
@Controller
@RequestMapping("/user")
public class UserInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Resource
    private IUserInfoService userInfoService;

    @RequestMapping(value = "/queryUserInfo", method = RequestMethod.GET)
    public void queryUserInfo(HttpServletRequest request, HttpServletResponse response) {
        ResponseVo vo = new ResponseVo();
        try {
            String requestVo = getData(request, response);
            if (requestVo == null) {
                vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.PARAM_ERROR);
                return;
            }
            UserInfoVo userInfoVo = JSON.parseObject(requestVo, UserInfoVo.class);
            UserInfoVo info = userInfoService.queryUserInfo(userInfoVo.getId());
            vo = ResponseVoUtils.buildSuccessResponseVo(info);
        } catch (Exception e) {
            LOGGER.error("error in UserInfoController.queryUserInfo", e);
            vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.SYSTEM_ERROR);
        } finally {
            this.sendData(response, vo);
        }
    }

    /**
     * 用户注册功能
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void register(HttpServletRequest request, HttpServletResponse response) {
        ResponseVo vo = new ResponseVo();
        try {
            String requestVo = getData(request, response);
            UserRegisterVo userRegisterVo = JSON.parseObject(requestVo, UserRegisterVo.class);
            //昵称不为空 and 密码不为空 and 确认密码和密码相同
            if (!StringUtils.isEmpty(userRegisterVo.getNickName())
                    && !StringUtils.isEmpty(userRegisterVo.getPassword())
                    && userRegisterVo.getPassword().equals(userRegisterVo.getPasswordConfirm())) {
                vo = userInfoService.register(userRegisterVo);
            } else {
                vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.PARAM_ERROR);
            }
        } catch (Exception e) {
            LOGGER.error("error in UserInfoController.register", e);
            vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.SYSTEM_ERROR);
        } finally {
            this.sendData(response, vo);
        }
    }

    /**
     * 用户登录功能
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void login(HttpServletRequest request, HttpServletResponse response) {
        ResponseVo vo = new ResponseVo();
        try {
            String ro = getData(request, response);
        } catch (Exception e) {
            LOGGER.error("error in UserInfoController.login", e);
            vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.SYSTEM_ERROR);
        } finally {
            this.sendData(response, vo);
        }
    }
}
