package codedriver.framework.inspect.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.dto.UserVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.Date;

public class InspectScheduleVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "ciId", type = ApiParamType.LONG)
    private Long ciId;
    @EntityField(name = "cron", type = ApiParamType.STRING)
    private String cron;
    @EntityField(name = "计划开始时间", type = ApiParamType.LONG)
    private Date beginTime;
    @EntityField(name = "计划结束时间", type = ApiParamType.LONG)
    private Date endTime;
    @EntityField(name = "状态(0:禁用，1：启用)", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "创建者uuid", type = ApiParamType.STRING)
    private String fcu;
    @EntityField(name = "创建日期", type = ApiParamType.STRING)
    private Date fcd;
    @EntityField(name = "修改者uuid", type = ApiParamType.STRING)
    private String lcu;
    @EntityField(name = "修改日期", type = ApiParamType.STRING)
    private Date lcd;
    @EntityField(name = "创建者")
    private UserVo fcuVo;
    @EntityField(name = "修改者", type = ApiParamType.STRING)
    private UserVo lcuVo;

    @EntityField(name = "ciLabel", type = ApiParamType.STRING)
    private String ciLabel;
    @EntityField(name = "ciName", type = ApiParamType.STRING)
    private String ciName;
    @EntityField(name = "执行次数", type = ApiParamType.INTEGER)
    private Integer execCount;

    public InspectScheduleVo() {
    }

    public InspectScheduleVo(Long ciId, String ciLabel, String ciName) {
        this.ciId = ciId;
        this.ciLabel = ciLabel;
        this.ciName = ciName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCiId() {
        return ciId;
    }

    public void setCiId(Long ciId) {
        this.ciId = ciId;
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

    public String getFcu() {
        return fcu;
    }

    public void setFcu(String fcu) {
        this.fcu = fcu;
    }

    public Date getFcd() {
        return fcd;
    }

    public void setFcd(Date fcd) {
        this.fcd = fcd;
    }

    public String getLcu() {
        return lcu;
    }

    public void setLcu(String lcu) {
        this.lcu = lcu;
    }

    public Date getLcd() {
        return lcd;
    }

    public void setLcd(Date lcd) {
        this.lcd = lcd;
    }

    public UserVo getFcuVo() {
        return fcuVo;
    }

    public void setFcuVo(UserVo fcuVo) {
        this.fcuVo = fcuVo;
    }

    public UserVo getLcuVo() {
        return lcuVo;
    }

    public void setLcuVo(UserVo lcuVo) {
        this.lcuVo = lcuVo;
    }

    public String getCiLabel() {
        return ciLabel;
    }

    public void setCiLabel(String ciLabel) {
        this.ciLabel = ciLabel;
    }

    public String getCiName() {
        return ciName;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName;
    }

    public Integer getExecCount() {
        return execCount;
    }

    public void setExecCount(Integer execCount) {
        this.execCount = execCount;
    }
}
