/*
Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.

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
import neatlogic.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

public class InspectNewProblemCustomViewVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "用户uuid", type = ApiParamType.STRING)
    private String userUuid;
    @EntityField(name = "条件", type = ApiParamType.JSONOBJECT)
    private JSONObject conditionConfig;
    @EntityField(name = "排序", type = ApiParamType.INTEGER)
    private Integer sort;
    @JSONField(serialize = false)
    private String conditionConfigStr;

    public InspectNewProblemCustomViewVo() {
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public JSONObject getConditionConfig() {
        if (MapUtils.isEmpty(conditionConfig) && StringUtils.isNotBlank(conditionConfigStr)) {
            try {
                conditionConfig = JSONObject.parseObject(conditionConfigStr);
            } catch (Exception ignored) {

            }
        }
        return conditionConfig;
    }

    public void setConditionConfig(JSONObject conditionConfig) {
        this.conditionConfig = conditionConfig;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getConditionConfigStr() {
        if (StringUtils.isBlank(conditionConfigStr) && MapUtils.isNotEmpty(conditionConfig)) {
            conditionConfigStr = conditionConfig.toJSONString();
        }
        return conditionConfigStr;
    }

    public void setConditionConfigStr(String conditionConfigStr) {
        this.conditionConfigStr = conditionConfigStr;
    }
}
