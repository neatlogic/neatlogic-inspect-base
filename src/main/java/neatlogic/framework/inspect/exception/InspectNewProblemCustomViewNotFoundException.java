package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectNewProblemCustomViewNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -2773976730974727264L;

    public InspectNewProblemCustomViewNotFoundException(Long id) {
        super("巡检最新问题个人视图分类“{0}”不存在", id);
    }
}
