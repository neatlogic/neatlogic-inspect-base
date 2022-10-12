package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectNewProblemCustomViewNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -2773976730974727264L;

    public InspectNewProblemCustomViewNotFoundException(Long id) {
        super("巡检最新问题个人视图分类“" + id + "”不存在");
    }
}
