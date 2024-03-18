/*Copyright (C) 2023  深圳极向量科技有限公司 All Rights Reserved.

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
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.Date;

public class InspectAlertEverydayVo {
    @EntityField(name = "资产id", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "巡检时间", type = ApiParamType.LONG)
    private Date reportTime;
    @EntityField(name = "告警级别", type = ApiParamType.STRING)
    private String alertLevel;
    @EntityField(name = "告警对象", type = ApiParamType.STRING)
    private String alertObject;
    @EntityField(name = "告警规则", type = ApiParamType.STRING)
    private String alertRule;
    @EntityField(name = "告警提示", type = ApiParamType.STRING)
    private String alertTips;
    @EntityField(name = "告警级别", type = ApiParamType.STRING)
    private String alertValue;

    public InspectAlertEverydayVo() {
    }

    public InspectAlertEverydayVo(JSONObject o, Long resourceId) {
        this.resourceId = resourceId;
        this.alertLevel = o.getString("alertLevel");
        this.alertObject = o.getString("alertObject");
        this.alertRule = o.getString("alertRule");
        this.alertValue = o.getString("alertValue");
        this.alertTips = o.getString("alertTips");
        this.reportTime = o.getDate("reportTime");
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }

    public String getAlertObject() {
        return alertObject;
    }

    public void setAlertObject(String alertObject) {
        this.alertObject = alertObject;
    }

    public String getAlertRule() {
        return alertRule;
    }

    public void setAlertRule(String alertRule) {
        this.alertRule = alertRule;
    }

    public String getAlertTips() {
        return alertTips;
    }

    public void setAlertTips(String alertTips) {
        this.alertTips = alertTips;
    }

    public String getAlertValue() {
        return alertValue;
    }

    public void setAlertValue(String alertValue) {
        this.alertValue = alertValue;
    }
}
