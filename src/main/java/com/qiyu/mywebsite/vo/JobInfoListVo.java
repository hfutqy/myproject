package com.qiyu.mywebsite.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 求职信息列表vo
 * Created by qiyu on 2018/3/4
 */
public class JobInfoListVo {
    private Integer id;

    private String jobName;

    private Integer jobType;

    private String jobTypeName;

    private String jobLocation;

    private Integer workTimeBeg;

    private Integer workTimeEnd;

    private Integer education;

    private String educationName;

    private Integer salaryBeg;

    private Integer salaryEnd;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date releaseTime;

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
        this.jobName = jobName;
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
        this.jobLocation = jobLocation;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getJobTypeName() {
        return jobTypeName;
    }

    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }
}
