package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectDefLessNameException extends ApiRuntimeException {
    public InspectDefLessNameException(int i) {
        super("第" + i + 1 + "规则缺少名称参数");
    }
}
