package com.qiyu.mywebsite.vo;

/**
 * 职位信息详情
 * Created by qiyu on 2018/3/6.
 */
public class JobInfoDetailVo extends JobInfoVo{

    private Integer jobId;

    private String jobCompanyDescrip;

    private String workPlace;

    private String jobPoster;

    private String jobPosterPosition;

    private String jobCompany;

    private String jobDescrip;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobCompanyDescrip() {
        return jobCompanyDescrip;
    }

    public void setJobCompanyDescrip(String jobCompanyDescrip) {
        this.jobCompanyDescrip = jobCompanyDescrip;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getJobPoster() {
        return jobPoster;
    }

    public void setJobPoster(String jobPoster) {
        this.jobPoster = jobPoster;
    }

    public String getJobPosterPosition() {
        return jobPosterPosition;
    }

    public void setJobPosterPosition(String jobPosterPosition) {
        this.jobPosterPosition = jobPosterPosition;
    }

    public String getJobCompany() {
        return jobCompany;
    }

    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany;
    }

    public String getJobDescrip() {
        return jobDescrip;
    }

    public void setJobDescrip(String jobDescrip) {
        this.jobDescrip = jobDescrip;
    }
}
