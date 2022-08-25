/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.inspect.dto;

import codedriver.framework.util.SnowflakeUtil;

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
}
