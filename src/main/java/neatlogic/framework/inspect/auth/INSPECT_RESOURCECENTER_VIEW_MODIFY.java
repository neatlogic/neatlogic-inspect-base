/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package neatlogic.framework.inspect.auth;

import neatlogic.framework.auth.core.AuthBase;
import neatlogic.framework.cmdb.auth.label.RESOURCECENTER_VIEW_MODIFY;

import java.util.Collections;
import java.util.List;

/** 巡检模块资源中心视图设置权限，并授予对应的CMDB视图设置能力。 */
public class INSPECT_RESOURCECENTER_VIEW_MODIFY extends AuthBase {

    @Override
    public String getAuthDisplayName() {
        return "auth.inspect_resourcecenter_view_modify.name";
    }

    @Override
    public String getAuthIntroduction() {
        return "auth.inspect_resourcecenter_view_modify.description";
    }

    @Override
    public String getAuthGroup() {
        return "inspect";
    }

    @Override
    public Integer getSort() {
        return 10;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Collections.singletonList(RESOURCECENTER_VIEW_MODIFY.class);
    }
}
