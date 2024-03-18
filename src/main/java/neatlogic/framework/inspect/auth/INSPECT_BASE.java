/*Copyright (C) $today.year  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

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
