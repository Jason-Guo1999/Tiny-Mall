package com.jason.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsPermission implements Serializable {
    private Long id;

    @ApiModelProperty(value = "þêÂþ║ºµØâÚÖÉid")
    private Long pid;

    @ApiModelProperty(value = "ÕÉìþº░")
    private String name;

    @ApiModelProperty(value = "µØâÚÖÉÕÇ╝")
    private String value;

    @ApiModelProperty(value = "Õø¥µáç")
    private String icon;

    @ApiModelProperty(value = "µØâÚÖÉþ▒╗Õ×ï´╝Ü0->þø«Õ¢ò´╝ø1->ÞÅ£Õìò´╝ø2->µîëÚÆ«´╝êµÄÑÕÅúþ╗æÕ«ÜµØâÚÖÉ´╝ë")
    private Integer type;

    @ApiModelProperty(value = "Õëìþ½»ÞÁäµ║ÉÞÀ»Õ¥ä")
    private String uri;

    @ApiModelProperty(value = "ÕÉ»þö¿þèÂµÇü´╝ø0->þªüþö¿´╝ø1->ÕÉ»þö¿")
    private Integer status;

    @ApiModelProperty(value = "ÕêøÕ╗║µùÂÚù┤")
    private Date createTime;

    @ApiModelProperty(value = "µÄÆÕ║Å")
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", icon=").append(icon);
        sb.append(", type=").append(type);
        sb.append(", uri=").append(uri);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}