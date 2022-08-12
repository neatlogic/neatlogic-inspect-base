/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.dto;

import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.util.SnowflakeUtil;

import java.util.Date;

public class InspectResourceConfigurationFileVersionVo extends BasePageVo {
    private Long id;
    private String md5;
    private Date InspectTime;
    private Long fileId;
    private Long recordId;
    private Long pathId;

    public InspectResourceConfigurationFileVersionVo() {}

    public InspectResourceConfigurationFileVersionVo(String md5, Date inspectTime, Long fileId, Long recordId, Long pathId) {
        this.md5 = md5;
        InspectTime = inspectTime;
        this.fileId = fileId;
        this.recordId = recordId;
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

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Date getInspectTime() {
        return InspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        InspectTime = inspectTime;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getPathId() {
        return pathId;
    }

    public void setPathId(Long pathId) {
        this.pathId = pathId;
    }
}
