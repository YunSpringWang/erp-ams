package com.common.entity;

import java.util.Date;

public class SysOrganization {
    private Integer orgId;

    private Integer orgFaterId;

    private String orgName;

    private Date orgCreateDate;

    private String orgDescription;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getOrgFaterId() {
        return orgFaterId;
    }

    public void setOrgFaterId(Integer orgFaterId) {
        this.orgFaterId = orgFaterId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Date getOrgCreateDate() {
        return orgCreateDate;
    }

    public void setOrgCreateDate(Date orgCreateDate) {
        this.orgCreateDate = orgCreateDate;
    }

    public String getOrgDescription() {
        return orgDescription;
    }

    public void setOrgDescription(String orgDescription) {
        this.orgDescription = orgDescription == null ? null : orgDescription.trim();
    }
}