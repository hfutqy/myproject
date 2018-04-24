package com.hfutse.mywebsite.po;

import java.util.Date;

public class JobInfoDetailPo {
    private Integer id;

    private Integer jobId;

    private String jobCompanyDescrip;

    private String workPlace;

    private String jobPoster;

    private String jobPosterPosition;

    private Date addTime;

    private Date updateTime;

    private Byte delFlag;

    private String remark;

    private String jobCompany;

    private String jobDescrip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        this.jobCompanyDescrip = jobCompanyDescrip == null ? null : jobCompanyDescrip.trim();
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace == null ? null : workPlace.trim();
    }

    public String getJobPoster() {
        return jobPoster;
    }

    public void setJobPoster(String jobPoster) {
        this.jobPoster = jobPoster == null ? null : jobPoster.trim();
    }

    public String getJobPosterPosition() {
        return jobPosterPosition;
    }

    public void setJobPosterPosition(String jobPosterPosition) {
        this.jobPosterPosition = jobPosterPosition == null ? null : jobPosterPosition.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getJobCompany() {
        return jobCompany;
    }

    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany == null ? null : jobCompany.trim();
    }

    public String getJobDescrip() {
        return jobDescrip;
    }

    public void setJobDescrip(String jobDescrip) {
        this.jobDescrip = jobDescrip == null ? null : jobDescrip.trim();
    }
}