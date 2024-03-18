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
