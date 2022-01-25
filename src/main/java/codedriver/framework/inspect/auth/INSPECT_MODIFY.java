/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.auth;

import codedriver.framework.auth.core.AuthBase;

import java.util.Arrays;
import java.util.List;

public class INSPECT_MODIFY extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "巡检管理员权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "设置阈值规则，预定义模型对应的巡检工具";
    }

    @Override
    public String getAuthGroup() {
        return "inspect";
    }

    @Override
    public Integer getSort() {
        return 1;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths(){
        return  Arrays.asList(INSPECT_SCHEDULE_EXECUTE.class,INSPECT_EXECUTE.class);
    }
}
