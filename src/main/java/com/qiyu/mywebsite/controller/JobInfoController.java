package com.qiyu.mywebsite.controller;

import com.alibaba.fastjson.JSON;
import com.qiyu.mywebsite.constant.ErrorCode;
import com.qiyu.mywebsite.service.IJobInfoService;
import com.qiyu.mywebsite.service.IUserInfoService;
import com.qiyu.mywebsite.utils.ResponseVoUtils;
import com.qiyu.mywebsite.vo.QueryJobInfoListVo;
import com.qiyu.mywebsite.vo.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 职位信息controller
 * Created by qiyu on 2018/3/4
 */
@Controller
@RequestMapping("/jobInfo")
public class JobInfoController extends BaseController{

    private static final Logger LOGGER = LoggerFactory.getLogger(JobInfoController.class);

    @Resource
    private IJobInfoService jobInfoService;

    @RequestMapping(value = "/queryList", method = RequestMethod.GET)
    public void queryJobInfoList(HttpServletRequest request, HttpServletResponse response) {
        ResponseVo vo = new ResponseVo();
        try {
            String requestVo = getData(request, response);
            if (requestVo == null) {
                vo = ResponseVoUtils.buildErrorResponseVo(ErrorCode.PARAM_ERROR);
                return;
            }
            QueryJobInfoListVo queryVo = JSON.parseObject(requestVo, QueryJobInfoListVo.class);
            vo = ResponseVoUtils.buildSuccessResponseVo(jobInfoService.queryList(queryVo));
        } catch (Exception e) {
            LOGGER.error("error in UserInfoController.queryUserInfo", e);
            vo = ResponseVoUtils.buildErrorResponseVo(ErrorCode.SYSTEM_ERROR);
        } finally {
            this.sendData(response, vo);
        }
    }

}
