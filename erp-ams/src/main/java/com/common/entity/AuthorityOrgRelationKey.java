package com.common.entity;

public class AuthorityOrgRelationKey {
    private Integer sysAuthorityId;

    private Integer orgId;

    public Integer getSysAuthorityId() {
        return sysAuthorityId;
    }

    public void setSysAuthorityId(Integer sysAuthorityId) {
        this.sysAuthorityId = sysAuthorityId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}