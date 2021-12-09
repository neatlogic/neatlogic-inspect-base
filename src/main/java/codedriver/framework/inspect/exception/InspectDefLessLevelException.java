package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectDefLessLevelException extends ApiRuntimeException {
    public InspectDefLessLevelException(int i) {
        super("第" + i + 1 + "规则缺少级别参数");
    }
}
