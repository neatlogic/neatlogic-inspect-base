package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectDefRoleNameRepeatException extends ApiRuntimeException {
    public InspectDefRoleNameRepeatException(String name) {
        super("规则名称："+name+" 相同");
    }
}
