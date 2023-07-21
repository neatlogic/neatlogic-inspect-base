package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectNewProblemCustomViewNotFoundEditTargetException extends ApiRuntimeException {

    private static final long serialVersionUID = -2773976730974727265L;

    public InspectNewProblemCustomViewNotFoundEditTargetException(Long id) {
        super("nfie.inspectnewproblemcustomviewnotfoundedittargetexception.inspectnewproblemcustomviewnotfoundedittargetexception", id);
    }
}
