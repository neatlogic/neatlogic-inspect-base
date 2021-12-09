package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectDefLessRuleException extends ApiRuntimeException {
    public InspectDefLessRuleException() {
        super("缺少规则参数");
    }
}
