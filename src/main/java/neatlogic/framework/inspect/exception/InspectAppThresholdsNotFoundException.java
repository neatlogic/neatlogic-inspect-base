/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package neatlogic.framework.inspect.exception;

/**
 * @author longrf
 * @date 2022/11/23 17:25
 */

public class InspectAppThresholdsNotFoundException extends RuntimeException {
    public InspectAppThresholdsNotFoundException(Long appSystemId, String name) {
        super("应用id为：“" + appSystemId + "”的应用的“" + name + "”的阈值规则为空");
    }
}
