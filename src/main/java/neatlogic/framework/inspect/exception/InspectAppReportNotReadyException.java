/*
 * Copyright (C) 2025 TechSure Co., Ltd. All Rights Reserved.
 */
package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * 应用巡检报告尚不可下载异常。
 */
public class InspectAppReportNotReadyException extends ApiRuntimeException {
    private static final long serialVersionUID = 3551087863521433269L;

    public InspectAppReportNotReadyException(Long parentJobId) {
        super("nfie.inspectappreportnotreadyexception", parentJobId);
    }
}
