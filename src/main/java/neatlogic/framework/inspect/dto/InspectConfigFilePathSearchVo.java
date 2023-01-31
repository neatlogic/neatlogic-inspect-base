/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.inspect.dto;

import neatlogic.framework.common.dto.BasePageVo;

import java.util.List;

public class InspectConfigFilePathSearchVo extends BasePageVo {

    /**
     * 时间范围
     */
    private List<String> timeRange;

    public List<String> getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(List<String> timeRange) {
        this.timeRange = timeRange;
    }
}
