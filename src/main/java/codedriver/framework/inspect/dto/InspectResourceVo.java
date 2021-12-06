/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.dto;

import codedriver.framework.autoexec.dto.job.AutoexecJobPhaseNodeVo;
import codedriver.framework.cmdb.dto.resourcecenter.ResourceVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.inspect.constvalue.InspectStatus;
import codedriver.framework.restful.annotation.EntityField;
import org.apache.commons.lang3.StringUtils;

public class InspectResourceVo extends ResourceVo {
    private static final long serialVersionUID = -2029368211438672519L;
    @EntityField(name = "巡检状态Vo", type = ApiParamType.JSONOBJECT)
    private InspectStatusVo inspectStatusVo;
    @EntityField(name = "作业节点Vo", type = ApiParamType.JSONOBJECT)
    private AutoexecJobPhaseNodeVo jobPhaseNodeVo;


    public InspectStatusVo getInspectStatusVo() {
        if (inspectStatusVo == null && StringUtils.isNotBlank(getInspectStatus())) {
            InspectStatus inspectStatus = InspectStatus.getInspectStatus(getInspectStatus());
            if (inspectStatus != null) {
                return new InspectStatusVo(inspectStatus);
            }
        }
        return inspectStatusVo;
    }

    public AutoexecJobPhaseNodeVo getJobPhaseNodeVo() {
        return jobPhaseNodeVo;
    }

    public void setJobPhaseNodeVo(AutoexecJobPhaseNodeVo jobPhaseNodeVo) {
        this.jobPhaseNodeVo = jobPhaseNodeVo;
    }
}
