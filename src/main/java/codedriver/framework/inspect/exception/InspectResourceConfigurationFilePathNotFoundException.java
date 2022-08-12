package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectResourceConfigurationFilePathNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939364652097L;

    public InspectResourceConfigurationFilePathNotFoundException(Long id) {
        super("巡检资源路径'" + id + "'不存在");
    }
    public InspectResourceConfigurationFilePathNotFoundException(String resourceName, Long id) {
        super("巡检资源'" + resourceName + "'路径'" + id + "'不存在");
    }
    public InspectResourceConfigurationFilePathNotFoundException(String resourceName, String path) {
        super("巡检资源'" + resourceName + "'路径'" + path + "'不存在");
    }
}
