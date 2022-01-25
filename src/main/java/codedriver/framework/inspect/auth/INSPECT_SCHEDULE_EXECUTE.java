/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.auth;

import codedriver.framework.auth.core.AuthBase;

import java.util.Collections;
import java.util.List;

public class INSPECT_SCHEDULE_EXECUTE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "巡检定时作业权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "发起定时巡检作业";
    }

    @Override
    public String getAuthGroup() {
        return "inspect";
    }

    @Override
    public Integer getSort() {
        return 3;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Collections.singletonList(INSPECT_BASE.class);
    }
}
