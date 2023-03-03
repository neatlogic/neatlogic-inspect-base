package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectDefLessRuleException extends ApiRuntimeException {
    public InspectDefLessRuleException(int i) {
        super("exception.inspect.inspectdeflessruleexception", (i + 1));
    }
}
