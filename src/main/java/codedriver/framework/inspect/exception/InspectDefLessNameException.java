package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectDefLessNameException extends ApiRuntimeException {
    public InspectDefLessNameException() {
        super("缺少名称参数");
    }
}
