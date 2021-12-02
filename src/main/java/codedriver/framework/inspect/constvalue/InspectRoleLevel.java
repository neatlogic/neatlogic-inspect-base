/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.inspect.constvalue;

import codedriver.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public enum InspectRoleLevel implements IEnum {
    WARN("WARN", "警告"),
    CRITICAL("CRITICAL", "严重");
    private final String value;
    private final String text;

    InspectRoleLevel(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (InspectRoleLevel level : values()) {
            array.add(new JSONObject() {
                {
                    this.put("value", level.getValue());
                    this.put("text", level.getText());
                }
            });
        }
        return array;
    }
}
