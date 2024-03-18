/*Copyright (C) 2024  深圳极向量科技有限公司 All Rights Reserved.

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
