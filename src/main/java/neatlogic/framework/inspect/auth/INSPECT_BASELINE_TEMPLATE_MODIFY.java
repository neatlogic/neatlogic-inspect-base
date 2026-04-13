package neatlogic.framework.inspect.auth;

import neatlogic.framework.auth.core.AuthBase;

import java.util.Collections;
import java.util.List;

public class INSPECT_BASELINE_TEMPLATE_MODIFY extends AuthBase {

    @Override
    public String getAuthDisplayName() {
        return "基线管理权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "用于维护基线模板层级、描述和编辑授权";
    }

    @Override
    public String getAuthGroup() {
        return "inspect";
    }

    @Override
    public Integer getSort() {
        return 6;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Collections.singletonList(INSPECT_BASE.class);
    }
}
