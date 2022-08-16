/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.dto;

import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.util.SnowflakeUtil;

import java.util.Date;

public class InspectConfigFilePathVo extends BasePageVo {
    private Long id;
    private Long resourceId;
    private String path;
    private String md5;
    private Date inspectTime;
    private Long fileId;

    public InspectConfigFilePathVo() {}

    public InspectConfigFilePathVo(Long id, String md5, Date inspectTime, Long fileId) {
        this.id = id;
        this.md5 = md5;
        this.inspectTime = inspectTime;
        this.fileId = fileId;
    }

    public InspectConfigFilePathVo(Long resourceId, String path) {
        this.resourceId = resourceId;
        this.path = path;
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

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
}
