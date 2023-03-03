package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectNewProblemCustomViewNameRepeatException extends ApiRuntimeException {
    private static final long serialVersionUID = 6573116997440656559L;

    public InspectNewProblemCustomViewNameRepeatException(String name) {
        super("exception.inspect.inspectnewproblemcustomviewnamerepeatexception", name);
    }
}
