package com.common.entity;

import java.util.Date;

public class SysAuthority {
    private Integer sysAuthorityId;

    private Integer sysAuthorityFatherId;

    private String sysAuthorityName;

    private Date sysAuthorityCreateDate;

    private String sysAuthorityType;

    private String sysAuthorityDescription;

    public Integer getSysAuthorityId() {
        return sysAuthorityId;
    }

    public void setSysAuthorityId(Integer sysAuthorityId) {
        this.sysAuthorityId = sysAuthorityId;
    }

    public Integer getSysAuthorityFatherId() {
        return sysAuthorityFatherId;
    }

    public void setSysAuthorityFatherId(Integer sysAuthorityFatherId) {
        this.sysAuthorityFatherId = sysAuthorityFatherId;
    }

    public String getSysAuthorityName() {
        return sysAuthorityName;
    }

    public void setSysAuthorityName(String sysAuthorityName) {
        this.sysAuthorityName = sysAuthorityName == null ? null : sysAuthorityName.trim();
    }

    public Date getSysAuthorityCreateDate() {
        return sysAuthorityCreateDate;
    }

    public void setSysAuthorityCreateDate(Date sysAuthorityCreateDate) {
        this.sysAuthorityCreateDate = sysAuthorityCreateDate;
    }

    public String getSysAuthorityType() {
        return sysAuthorityType;
    }

    public void setSysAuthorityType(String sysAuthorityType) {
        this.sysAuthorityType = sysAuthorityType == null ? null : sysAuthorityType.trim();
    }

    public String getSysAuthorityDescription() {
        return sysAuthorityDescription;
    }

    public void setSysAuthorityDescription(String sysAuthorityDescription) {
        this.sysAuthorityDescription = sysAuthorityDescription == null ? null : sysAuthorityDescription.trim();
    }
}