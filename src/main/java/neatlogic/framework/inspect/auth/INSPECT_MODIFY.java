/*
Copyright(c) $today.year NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package neatlogic.framework.inspect.auth;

import neatlogic.framework.auth.core.AuthBase;

import java.util.Arrays;
import java.util.List;

public class INSPECT_MODIFY extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "auth.inspect.inspectmodify.name";
    }

    @Override
    public String getAuthIntroduction() {
        return "auth.inspect.inspectmodify.introduction";
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
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Arrays.asList(INSPECT_SCHEDULE_EXECUTE.class, INSPECT_EXECUTE.class, INSPECT_CONFIG_FILE_MODIFY.class);
    }
}
