package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectCiCombopNotBindException extends ApiRuntimeException {
    private static final long serialVersionUID = 7582055639241678278L;

    public InspectCiCombopNotBindException(String name) {
        super("ci：“{0}” 没有绑定组合工具，请确认后重试", name);
    }
}
