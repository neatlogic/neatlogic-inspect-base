package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectDefLessRuleException extends ApiRuntimeException {
    public InspectDefLessRuleException(int i) {
        super("第" + (i + 1) + "条规则缺少规则参数");
    }
}
