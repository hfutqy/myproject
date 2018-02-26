package com.qiyu.mywebsite.controller;

import com.qiyu.mywebsite.service.IUserInfoService;
import com.qiyu.mywebsite.vo.ResponseVo;
import com.qiyu.mywebsite.vo.UserInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
            String ro = getData(request, response);
            UserInfoVo userInfoVo = toBean(ro, UserInfoVo.class);
            UserInfoVo info = userInfoService.queryUserInfo(userInfoVo.getId());
            vo.setData(info);
        } catch (Exception e) {
            LOGGER.error("error in UserInfoController.queryUserInfo", e);
        } finally {
            this.sendData(response, vo);
        }
    }
}
