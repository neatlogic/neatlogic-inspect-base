/*
 * Copyright (C) 2025 TechSure Co., Ltd. All Rights Reserved.
 */
package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * 应用巡检父作业不合法异常。
 */
public class InspectAppParentJobInvalidException extends ApiRuntimeException {
    private static final long serialVersionUID = -2463195233959802677L;

    public InspectAppParentJobInvalidException(Long parentJobId) {
        super("nfie.inspectappparentjobinvalidexception", parentJobId);
    }
}
