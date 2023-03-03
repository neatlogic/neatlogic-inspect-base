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

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;

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
