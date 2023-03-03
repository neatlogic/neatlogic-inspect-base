package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectDefLessNameException extends ApiRuntimeException {
    public InspectDefLessNameException(int i) {
        super("exception.inspect.inspectdeflessnameexception", (i + 1));
    }
}
