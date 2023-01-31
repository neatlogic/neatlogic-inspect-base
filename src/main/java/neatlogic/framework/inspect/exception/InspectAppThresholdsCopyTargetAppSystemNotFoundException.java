/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package neatlogic.framework.inspect.exception;

/**
 * @author longrf
 * @date 2022/11/23 17:32
 */

public class InspectAppThresholdsCopyTargetAppSystemNotFoundException extends RuntimeException {
    public InspectAppThresholdsCopyTargetAppSystemNotFoundException() {
        super("所选目标应用已不存在，复制应用个性化阈值失败");
    }
}
