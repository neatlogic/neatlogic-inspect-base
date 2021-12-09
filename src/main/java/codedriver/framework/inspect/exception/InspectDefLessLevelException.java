package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectDefLessLevelException extends ApiRuntimeException {
    public InspectDefLessLevelException() {
        super("缺少级别参数");
    }
}
