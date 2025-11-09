/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package neatlogic.framework.inspect.dto;

import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.autoexec.dto.job.AutoexecJobPhaseNodeVo;
import neatlogic.framework.cmdb.dto.resourcecenter.ResourceVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.Date;

public class InspectResourceVo extends ResourceVo {
    private static final long serialVersionUID = -2029368211438672519L;
    @EntityField(name = "作业节点Vo", type = ApiParamType.JSONOBJECT)
    private AutoexecJobPhaseNodeVo jobPhaseNodeVo;
    @EntityField(name = "巡检结果", type = ApiParamType.JSONOBJECT)
    private JSONObject inspectResult;
    @EntityField(name = "脚本")
    private InspectResourceScriptVo script;
    @EntityField(name = "最近配置文件变更时间")
    private Date lastChangeTime;

    public InspectResourceVo() {
    }

    public InspectResourceVo(ResourceVo resourceVo) {
        super(resourceVo);
    }

    public AutoexecJobPhaseNodeVo getJobPhaseNodeVo() {
        return jobPhaseNodeVo;
    }

    public JSONObject getInspectResult() {
        return inspectResult;
    }

    public void setInspectResult(JSONObject inspectResult) {
        this.inspectResult = inspectResult;
    }

    public void setJobPhaseNodeVo(AutoexecJobPhaseNodeVo jobPhaseNodeVo) {
        this.jobPhaseNodeVo = jobPhaseNodeVo;
    }

    public InspectResourceScriptVo getScript() {
        return script;
    }

    public void setScript(InspectResourceScriptVo script) {
        this.script = script;
    }

    public Date getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(Date lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }
}
