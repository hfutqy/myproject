package com.hfutse.mywebsite.controller;

import com.alibaba.fastjson.JSON;
import com.hfutse.mywebsite.utils.ResponseVoUtils;
import com.hfutse.mywebsite.vo.BaseQueryVo;
import com.hfutse.mywebsite.vo.QueryJobInfoListVo;
import com.hfutse.mywebsite.vo.ResponseVo;
import com.hfutse.mywebsite.constant.BaseErrorCode;
import com.hfutse.mywebsite.service.IJobInfoService;
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
 * 职位信息controller
 * Created by qiyu on 2018/3/4
 */
@Controller
@RequestMapping("/jobInfo")
public class JobInfoController extends BaseController{

    private static final Logger LOGGER = LoggerFactory.getLogger(JobInfoController.class);

    @Resource
    private IJobInfoService jobInfoService;

    /**
     * 查询求职信息列表
     * @param request
     * @param response
     */
    @RequestMapping(value = "/queryList", method = RequestMethod.GET)
    public void queryJobInfoList(HttpServletRequest request, HttpServletResponse response) {
        ResponseVo vo = new ResponseVo();
        try {
            //入参整合+校验
            String requestVo = getData(request, response);
            if (StringUtils.isEmpty(requestVo)) {
                vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.PARAM_ERROR);
                return;
            }
            QueryJobInfoListVo queryVo = JSON.parseObject(requestVo, QueryJobInfoListVo.class);
            vo = ResponseVoUtils.buildSuccessResponseVo(jobInfoService.queryList(queryVo));
        } catch (Exception e) {
            LOGGER.error("error in UserInfoController.queryUserInfo", e);
            vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.SYSTEM_ERROR);
        } finally {
            this.sendData(response, vo);
        }
    }


    /**
     * 查询求职信息详情
     * @param request
     * @param response
     */
    @RequestMapping(value = "/queryDetail", method = RequestMethod.GET)
    public void queryJobInfoDetail(HttpServletRequest request, HttpServletResponse response) {
        ResponseVo vo = new ResponseVo();
        try {
            //入参整合+校验
            String requestVo = getData(request, response);
            if (requestVo == null) {
                vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.PARAM_ERROR);
                return;
            }
            BaseQueryVo queryVo = JSON.parseObject(requestVo, BaseQueryVo.class);
            vo = ResponseVoUtils.buildSuccessResponseVo(jobInfoService.queryDetail(queryVo));
        } catch (Exception e) {
            LOGGER.error("error in UserInfoController.queryUserInfo", e);
            vo = ResponseVoUtils.buildErrorResponseVo(BaseErrorCode.SYSTEM_ERROR);
        } finally {
            this.sendData(response, vo);
        }
    }

}
