package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectAppSystemScheduleNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939365652098L;

    public InspectAppSystemScheduleNotFoundException(Long id) {
        super("exception.inspect.inspectappsystemschedulenotfoundexception", id);
    }
}
