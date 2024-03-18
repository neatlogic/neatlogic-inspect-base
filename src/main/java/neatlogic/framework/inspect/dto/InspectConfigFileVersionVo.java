/*Copyright (C) $today.year  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.inspect.dto;

import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.lcs.BaseLineVo;
import neatlogic.framework.util.SnowflakeUtil;

import java.util.Date;
import java.util.List;

public class InspectConfigFileVersionVo extends BasePageVo {
    private Long id;
    private String md5;
    private Date inspectTime;
    private Long fileId;
    private Long auditId;
    private Long pathId;

    private Long jobId;
    private List<BaseLineVo> lineList;
    public InspectConfigFileVersionVo() {}

    public InspectConfigFileVersionVo(String md5, Date inspectTime, Long fileId, Long auditId, Long pathId, Long jobId) {
        this.md5 = md5;
        this.inspectTime = inspectTime;
        this.fileId = fileId;
        this.auditId = auditId;
        this.pathId = pathId;
        this.jobId = jobId;
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

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public List<BaseLineVo> getLineList() {
        return lineList;
    }

    public void setLineList(List<BaseLineVo> lineList) {
        this.lineList = lineList;
    }
}
