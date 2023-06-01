package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectDefLessLevelException extends ApiRuntimeException {
    public InspectDefLessLevelException(int i) {
        super("第{0}条规则缺少级别参数", (i + 1));
    }
}
