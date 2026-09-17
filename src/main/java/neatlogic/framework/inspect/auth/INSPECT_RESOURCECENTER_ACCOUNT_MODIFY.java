/*Copyright (C) 2023  深圳极向量科技有限公司 All Rights Reserved.

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
import neatlogic.framework.cmdb.auth.label.RESOURCECENTER_ACCOUNT_MODIFY;

import java.util.Collections;
import java.util.List;

/** 巡检模块账号管理权限，并授予对应的CMDB账号管理能力。 */
public class INSPECT_RESOURCECENTER_ACCOUNT_MODIFY extends AuthBase {

    @Override
    public String getAuthDisplayName() {
        return "auth.inspect_resourcecenter_account_modify.name";
    }

    @Override
    public String getAuthIntroduction() {
        return "auth.inspect_resourcecenter_account_modify.description";
    }

    @Override
    public String getAuthGroup() {
        return "inspect";
    }

    @Override
    public Integer getSort() {
        return 9;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Collections.singletonList(RESOURCECENTER_ACCOUNT_MODIFY.class);
    }
}
