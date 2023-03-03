package neatlogic.framework.inspect.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.scheduler.dto.JobStatusVo;

import java.util.Date;

public class InspectAppSystemScheduleVo extends BaseEditorVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "cron", type = ApiParamType.STRING)
    private String cron;
    @EntityField(name = "计划开始时间", type = ApiParamType.LONG)
    private Date beginTime;
    @EntityField(name = "计划结束时间", type = ApiParamType.LONG)
    private Date endTime;
    @EntityField(name = "状态(0:禁用，1：启用)", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "执行次数", type = ApiParamType.INTEGER)
    private Integer execCount = 0;

    @EntityField(name = "应用ID", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "应用简称", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "执行情况", type = ApiParamType.JSONOBJECT)
    private JobStatusVo jobStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getExecCount() {
        return execCount;
    }

    public void setExecCount(Integer execCount) {
        this.execCount = execCount;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public JobStatusVo getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatusVo jobStatus) {
        this.jobStatus = jobStatus;
    }
}
