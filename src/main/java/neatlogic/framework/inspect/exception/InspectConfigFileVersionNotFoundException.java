package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectConfigFileVersionNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939364652098L;

    public InspectConfigFileVersionNotFoundException(Long id) {
        super("巡检资源配置文件版本“{0}”不存在", id);
    }

}
