/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
