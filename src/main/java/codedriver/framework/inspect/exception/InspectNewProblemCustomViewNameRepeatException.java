package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectNewProblemCustomViewNameRepeatException extends ApiRuntimeException {
    private static final long serialVersionUID = 6573116997440656559L;

    public InspectNewProblemCustomViewNameRepeatException(String name) {
        super("巡检最新问题个人视图分类“" + name + "”已存在");
    }
}
