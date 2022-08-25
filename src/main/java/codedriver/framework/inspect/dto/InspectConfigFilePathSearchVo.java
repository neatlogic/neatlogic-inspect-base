/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.dto;

import codedriver.framework.asynchronization.threadlocal.TenantContext;
import codedriver.framework.common.dto.BasePageVo;

import java.util.List;

public class InspectConfigFilePathSearchVo extends BasePageVo {

    /**
     * 时间范围
     */
    private List<String> startTimeRange;

    public List<String> getStartTimeRange() {
        return startTimeRange;
    }

    public void setStartTimeRange(List<String> startTimeRange) {
        this.startTimeRange = startTimeRange;
    }

    public final String getSchemaName() {
        return TenantContext.get().getDataDbName();
    }
}
