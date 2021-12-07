/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.inspect.constvalue.InspectStatus;
import codedriver.framework.restful.annotation.EntityField;

public class InspectStatusVo {
    @EntityField(name = "巡检状态", type = ApiParamType.STRING)
    private String value;
    @EntityField(name = "巡检状态名", type = ApiParamType.STRING)
    private String text;
    @EntityField(name = "巡检状态class", type = ApiParamType.STRING)
    private String cssClass;

    public InspectStatusVo() {
    }

    public InspectStatusVo(InspectStatus inspectStatus) {
        this.value = inspectStatus.getValue();
        this.text = inspectStatus.getText();
        this.cssClass = inspectStatus.getCssClass();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }
}