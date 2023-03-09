/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package neatlogic.framework.inspect.constvalue;

import neatlogic.framework.autoexec.dto.AutoexecJobSourceVo;
import neatlogic.framework.autoexec.source.IAutoexecJobSource;

import java.util.ArrayList;
import java.util.List;

public enum JobSource implements IAutoexecJobSource {
    INSPECT("资产巡检", "inspect"),
    INSPECT_APP("应用巡检", "inspectapp"),
    SCHEDULE_INSPECT("资产定时巡检", "scheduleinspect"),
    SCHEDULE_INSPECT_APP("应用定时巡检", "scheduleinspectapp");
    private final String text;
    private final String value;

    JobSource(String _text, String _value) {
        this.text = _text;
        this.value = _value;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static String getText(String _status) {
        for (JobSource s : JobSource.values()) {
            if (s.getValue().equals(_status)) {
                return s.getText();
            }
        }
        return "";
    }

    /**
     * @return 返回对应的来源
     */
    @Override
    public List<AutoexecJobSourceVo> getSource() {
        List<AutoexecJobSourceVo> list = new ArrayList<>();
        for (JobSource s : JobSource.values()) {
            AutoexecJobSourceVo source = new AutoexecJobSourceVo();
            source.setSource(s.value);
            source.setSourceName(s.getText());
            source.setType(s.getType());
            list.add(source);
        }
        return list;
    }

}
