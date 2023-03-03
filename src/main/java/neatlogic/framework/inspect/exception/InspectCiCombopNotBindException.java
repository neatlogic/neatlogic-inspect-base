package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectCiCombopNotBindException extends ApiRuntimeException {
    private static final long serialVersionUID = 7582055639241678278L;

    public InspectCiCombopNotBindException(String name) {
        super("exception.inspect.inspectcicombopnotbindexception", name);
    }
}
