package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectDefLessRuleException extends ApiRuntimeException {
    public InspectDefLessRuleException(int i) {
        super("第{0}条规则缺少规则参数", (i + 1));
    }
}
