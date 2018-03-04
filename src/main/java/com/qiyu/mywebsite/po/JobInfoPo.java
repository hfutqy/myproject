package com.qiyu.mywebsite.po;

import java.util.Date;

public class JobInfoPo {
    private Integer id;

    private String jobName;

    private Integer jobType;

    private String jobLocation;

    private Integer workTimeBeg;

    private Integer workTimeEnd;

    private Integer education;

    private Integer salaryBeg;

    private Integer salaryEnd;

    private Date releaseTime;

    private Date addTime;

    private Date updateTime;

    private Byte delFlag;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation == null ? null : jobLocation.trim();
    }

    public Integer getWorkTimeBeg() {
        return workTimeBeg;
    }

    public void setWorkTimeBeg(Integer workTimeBeg) {
        this.workTimeBeg = workTimeBeg;
    }

    public Integer getWorkTimeEnd() {
        return workTimeEnd;
    }

    public void setWorkTimeEnd(Integer workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getSalaryBeg() {
        return salaryBeg;
    }

    public void setSalaryBeg(Integer salaryBeg) {
        this.salaryBeg = salaryBeg;
    }

    public Integer getSalaryEnd() {
        return salaryEnd;
    }

    public void setSalaryEnd(Integer salaryEnd) {
        this.salaryEnd = salaryEnd;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
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
}