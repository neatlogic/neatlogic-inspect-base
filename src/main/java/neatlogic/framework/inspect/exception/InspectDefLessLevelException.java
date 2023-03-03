package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectDefLessLevelException extends ApiRuntimeException {
    public InspectDefLessLevelException(int i) {
        super("exception.inspect.inspectdeflesslevelexception", (i + 1));
    }
}
