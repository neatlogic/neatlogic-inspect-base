package neatlogic.framework.inspect.constvalue;

import neatlogic.framework.autoexec.type.IAutoexecType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public enum AutoexecType implements IAutoexecType {
    INSPECT(1L,"INSPECT", "巡检")
    ;

    private final Long id;
    private final String value;
    private final String text;

    AutoexecType(Long id, String _value, String _text) {
        this.id = id;
        this.value = _value;
        this.text = _text;
    }

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    @Override
    public JSONArray getValueTextList() {
        JSONArray array = new JSONArray();
        for (AutoexecType s : values()) {
            JSONObject json = new JSONObject();
            json.put("id", s.getId());
            json.put("value", s.getValue());
            json.put("text", s.getText());
            array.add(json);
        }
        return array;
    }
}
