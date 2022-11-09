package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectAppSystemScheduleNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939365652098L;

    public InspectAppSystemScheduleNotFoundException(Long id) {
        super("应用巡检定时任务'" + id + "'不存在");
    }
}
