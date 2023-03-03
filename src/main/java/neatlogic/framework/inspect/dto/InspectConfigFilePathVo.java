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
