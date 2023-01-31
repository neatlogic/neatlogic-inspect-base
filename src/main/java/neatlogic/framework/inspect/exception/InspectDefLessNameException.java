package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectDefLessNameException extends ApiRuntimeException {
    public InspectDefLessNameException(int i) {
        super("第" + (i + 1) + "条规则缺少名称参数");
    }
}
