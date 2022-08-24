/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.dto;

import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.lcs.BaseLineVo;
import codedriver.framework.util.SnowflakeUtil;

import java.util.Date;
import java.util.List;

public class InspectConfigFileVersionVo extends BasePageVo {
    private Long id;
    private String md5;
    private Date inspectTime;
    private Long fileId;
    private Long auditId;
    private Long pathId;
    private List<BaseLineVo> lineList;
    public InspectConfigFileVersionVo() {}

    public InspectConfigFileVersionVo(String md5, Date inspectTime, Long fileId, Long auditId, Long pathId) {
        this.md5 = md5;
        this.inspectTime = inspectTime;
        this.fileId = fileId;
        this.auditId = auditId;
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
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public Long getPathId() {
        return pathId;
    }

    public void setPathId(Long pathId) {
        this.pathId = pathId;
    }

    public List<BaseLineVo> getLineList() {
        return lineList;
    }

    public void setLineList(List<BaseLineVo> lineList) {
        this.lineList = lineList;
    }
}
