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

package neatlogic.framework.inspect.dto;

import neatlogic.framework.util.SnowflakeUtil;

import java.io.Serializable;
import java.util.Date;

public class InspectConfigFilePathVo implements Serializable {
    /**
     * 唯一标识
     */
    private Long id;
    /**
     * 资产id
     */
    private Long resourceId;
    /**
     * 路径
     */
    private String path;
    /**
     * MD5
     */
    private String md5;
    /**
     * 最后一次修改时间
     */
    private Date inspectTime;
    /**
     * 文件id
     */
    private Long fileId;
    /**
     * 资产名称
     */
    private String resourceName;
    /**
     * 资产IP
     */
    private String resourceIp;
    /**
     * 资产端口
     */
    private Integer resourcePort;
    /**
     * 资产类型
     */
    private String resourceTypeLabel;
    /**
     * 版本数量
     */
    private int versionCount;
    /**
     * 版本ID
     */
    private Long versionId;
    public InspectConfigFilePathVo() {}

    public InspectConfigFilePathVo(Long id, String md5, Date inspectTime, Long fileId) {
        this.id = id;
        this.md5 = md5;
        this.inspectTime = inspectTime;
        this.fileId = fileId;
    }

    public InspectConfigFilePathVo(Long resourceId, String path) {
        this.resourceId = resourceId;
        this.path = path;
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Date getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceIp() {
        return resourceIp;
    }

    public void setResourceIp(String resourceIp) {
        this.resourceIp = resourceIp;
    }

    public Integer getResourcePort() {
        return resourcePort;
    }

    public void setResourcePort(Integer resourcePort) {
        this.resourcePort = resourcePort;
    }

    public String getResourceTypeLabel() {
        return resourceTypeLabel;
    }

    public void setResourceTypeLabel(String resourceTypeLabel) {
        this.resourceTypeLabel = resourceTypeLabel;
    }

    public int getVersionCount() {
        return versionCount;
    }

    public void setVersionCount(int versionCount) {
        this.versionCount = versionCount;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }
}
