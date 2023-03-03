package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectDefRoleNameRepeatException extends ApiRuntimeException {
    public InspectDefRoleNameRepeatException(String name) {
        super("exception.inspect.inspectdefrolenamerepeatexception", name);
    }
}
