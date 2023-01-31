/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package neatlogic.framework.inspect.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/12/14 17:10
 */

public class InspectDefLessRuleUuidException extends ApiRuntimeException {
    public InspectDefLessRuleUuidException(int i) {
        super("第" + (i + 1) + "条规则缺少规则uuid(ruleUuid)参数");
    }
}
