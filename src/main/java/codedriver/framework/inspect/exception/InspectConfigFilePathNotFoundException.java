package codedriver.framework.inspect.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InspectConfigFilePathNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939364652097L;

    public InspectConfigFilePathNotFoundException(Long id) {
        super("巡检资源路径'" + id + "'不存在");
    }
    public InspectConfigFilePathNotFoundException(String resourceName, Long id) {
        super("巡检资源'" + resourceName + "'路径'" + id + "'不存在");
    }
    public InspectConfigFilePathNotFoundException(String resourceName, String path) {
        super("巡检资源'" + resourceName + "'路径'" + path + "'不存在");
    }
}
