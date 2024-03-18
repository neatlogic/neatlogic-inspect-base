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
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
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
