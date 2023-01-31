/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.inspect.auth;

import neatlogic.framework.auth.core.AuthBase;
import neatlogic.framework.autoexec.auth.AUTOEXEC;
import neatlogic.framework.cmdb.auth.label.CMDB;

import java.util.Arrays;
import java.util.List;

public class INSPECT_BASE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "巡检基础权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "查看应用巡检报告、资产巡检报告、历史巡检报告、导出报告";
    }

    @Override
    public String getAuthGroup() {
        return "inspect";
    }

    @Override
    public Integer getSort() {
        return 2;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Arrays.asList(AUTOEXEC.class, CMDB.class);
    }
}
