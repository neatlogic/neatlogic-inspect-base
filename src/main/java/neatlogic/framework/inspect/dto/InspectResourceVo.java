/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.inspect.dto;

import neatlogic.framework.autoexec.dto.job.AutoexecJobPhaseNodeVo;
import neatlogic.framework.cmdb.dto.resourcecenter.ResourceVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;

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
