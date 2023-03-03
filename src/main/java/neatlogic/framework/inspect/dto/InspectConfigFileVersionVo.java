/*
Copyright(c) $today.year NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

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
