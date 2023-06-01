package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectAppSystemScheduleNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939365652098L;

    public InspectAppSystemScheduleNotFoundException(Long id) {
        super("应用巡检定时任务“{0}”不存在", id);
    }
}
