/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.dto;

import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.util.SnowflakeUtil;

import java.util.Date;

public class InspectResourceConfigurationFileRecordVo extends BasePageVo {
    private Long id;
    private Date inspectTime;
    private Long pathId;
    private Long versionId;

    public InspectResourceConfigurationFileRecordVo() {}

    public InspectResourceConfigurationFileRecordVo(Date inspectTime, Long pathId) {
        this.inspectTime = inspectTime;
        this.pathId = pathId;
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    public Long getPathId() {
        return pathId;
    }

    public void setPathId(Long pathId) {
        this.pathId = pathId;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }
}
