package com.yzu.recruit.dataaccess.model;

import java.util.List;

import com.yzu.recruit.dataaccess.model.gen.JobRecruitEntity;

public class JobRecruitEntityExt extends JobRecruitEntity {


    private DepartmentEntityExt departmentEntityExt;
    private JobEntityExt jobEntityExt;
    private List<JobRequireEntityExt> jobRequireEntityExts;
    private List<JobResponsibilityEntityExt> jobResponsibilityEntityExts;

    public DepartmentEntityExt getDepartmentEntityExt() {
        return departmentEntityExt;
    }

    public void setDepartmentEntityExt(DepartmentEntityExt departmentEntityExt) {
        this.departmentEntityExt = departmentEntityExt;
    }

    public JobEntityExt getJobEntityExt() {
        return jobEntityExt;
    }

    public void setJobEntityExt(JobEntityExt jobEntityExt) {
        this.jobEntityExt = jobEntityExt;
    }

    public List<JobRequireEntityExt> getJobRequireEntityExts() {
        return jobRequireEntityExts;
    }

    public void setJobRequireEntityExts(List<JobRequireEntityExt> jobRequireEntityExts) {
        this.jobRequireEntityExts = jobRequireEntityExts;
    }

    public List<JobResponsibilityEntityExt> getJobResponsibilityEntityExts() {
        return jobResponsibilityEntityExts;
    }

    public void setJobResponsibilityEntityExts(
            List<JobResponsibilityEntityExt> jobResponsibilityEntityExts) {
        this.jobResponsibilityEntityExts = jobResponsibilityEntityExts;
    }

}