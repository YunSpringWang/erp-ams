package com.common.entity;

import java.util.Date;

public class Authority {
    private Integer wAuthorityId;

    private Integer wAuthorityFatherId;

    private String wAuthorityName;

    private Date wAuthorityCreatedate;

    private String wAuthorityType;

    private String wAuthorityDescription;

    public Integer getwAuthorityId() {
        return wAuthorityId;
    }

    public void setwAuthorityId(Integer wAuthorityId) {
        this.wAuthorityId = wAuthorityId;
    }

    public Integer getwAuthorityFatherId() {
        return wAuthorityFatherId;
    }

    public void setwAuthorityFatherId(Integer wAuthorityFatherId) {
        this.wAuthorityFatherId = wAuthorityFatherId;
    }

    public String getwAuthorityName() {
        return wAuthorityName;
    }

    public void setwAuthorityName(String wAuthorityName) {
        this.wAuthorityName = wAuthorityName == null ? null : wAuthorityName.trim();
    }

    public Date getwAuthorityCreatedate() {
        return wAuthorityCreatedate;
    }

    public void setwAuthorityCreatedate(Date wAuthorityCreatedate) {
        this.wAuthorityCreatedate = wAuthorityCreatedate;
    }

    public String getwAuthorityType() {
        return wAuthorityType;
    }

    public void setwAuthorityType(String wAuthorityType) {
        this.wAuthorityType = wAuthorityType == null ? null : wAuthorityType.trim();
    }

    public String getwAuthorityDescription() {
        return wAuthorityDescription;
    }

    public void setwAuthorityDescription(String wAuthorityDescription) {
        this.wAuthorityDescription = wAuthorityDescription == null ? null : wAuthorityDescription.trim();
    }
}