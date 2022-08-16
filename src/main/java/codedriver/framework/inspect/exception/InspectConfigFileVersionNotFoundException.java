package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectConfigFileVersionNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939364652098L;

    public InspectConfigFileVersionNotFoundException(Long id) {
        super("巡检资源配置文件版本'" + id + "'不存在");
    }

}
