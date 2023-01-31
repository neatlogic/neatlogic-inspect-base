/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/9/28 10:49
 */

public class InspectUrlConfigIllegalException extends ApiRuntimeException {
    public InspectUrlConfigIllegalException() {
        super("配置URL拨测的拓展配置格式不对，请参考配置例子");
    }
}
