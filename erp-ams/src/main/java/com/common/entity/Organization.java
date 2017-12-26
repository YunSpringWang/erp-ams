package com.common.entity;

import java.util.Date;

public class Organization {
    private Integer wOrganizationId;

    private Integer wOrganizationFatherId;

    private String wOrganizationName;

    private Date wOrganizationCreatedate;

    private String wOrganizationDescription;

    public Integer getwOrganizationId() {
        return wOrganizationId;
    }

    public void setwOrganizationId(Integer wOrganizationId) {
        this.wOrganizationId = wOrganizationId;
    }

    public Integer getwOrganizationFatherId() {
        return wOrganizationFatherId;
    }

    public void setwOrganizationFatherId(Integer wOrganizationFatherId) {
        this.wOrganizationFatherId = wOrganizationFatherId;
    }

    public String getwOrganizationName() {
        return wOrganizationName;
    }

    public void setwOrganizationName(String wOrganizationName) {
        this.wOrganizationName = wOrganizationName == null ? null : wOrganizationName.trim();
    }

    public Date getwOrganizationCreatedate() {
        return wOrganizationCreatedate;
    }

    public void setwOrganizationCreatedate(Date wOrganizationCreatedate) {
        this.wOrganizationCreatedate = wOrganizationCreatedate;
    }

    public String getwOrganizationDescription() {
        return wOrganizationDescription;
    }

    public void setwOrganizationDescription(String wOrganizationDescription) {
        this.wOrganizationDescription = wOrganizationDescription == null ? null : wOrganizationDescription.trim();
    }
}