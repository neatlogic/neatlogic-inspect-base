package neatlogic.framework.inspect.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;

public class InspectResourceScriptVo extends BaseEditorVo {

    @EntityField(name = "脚本id", type = ApiParamType.LONG)
    private Long scriptId;
    @EntityField(name = "脚本名称", type = ApiParamType.STRING)
    private String scriptName;
    @EntityField(name = "资源id", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "拓展配置JSON", type = ApiParamType.JSONOBJECT)
    private JSONObject config;
    @JSONField(serialize = false)
    @EntityField(name = "拓展配置", type = ApiParamType.STRING)
    private String configStr;

    public InspectResourceScriptVo(Long scriptId, String scriptName) {
        this.scriptId = scriptId;
        this.scriptName = scriptName;
    }

    public Long getScriptId() {
        return scriptId;
    }

    public void setScriptId(Long scriptId) {
        this.scriptId = scriptId;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getConfigStr() {
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }

    public JSONObject getConfig() {
        if(StringUtils.isNotBlank(configStr)) {
            try {
                return JSONObject.parseObject(configStr);
            } catch (Exception ignored) {}
        }
        return new JSONObject();
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }
}
