package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class InspectConfigFilePathNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 279377939364652097L;

    public InspectConfigFilePathNotFoundException(Long id) {
        super("巡检资源路径'" + id + "'不存在");
    }

    public InspectConfigFilePathNotFoundException(String resourceName, Long id) {
        super("巡检资源“{1}”路径“{0}”不存在", resourceName, id);
    }

    public InspectConfigFilePathNotFoundException(String resourceName, String path) {
        super("巡检资源“{1}”路径“{0}”不存在", resourceName, path);
    }
}
