package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectScheduleNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939364652096L;

    public InspectScheduleNotFoundException(Long id) {
        super("巡检定时任务'" + id + "'不存在");
    }
}
