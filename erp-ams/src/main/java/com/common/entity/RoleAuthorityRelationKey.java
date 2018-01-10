package com.common.entity;

public class RoleAuthorityRelationKey {
    private Integer roleId;

    private Integer sysAuthorityId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getSysAuthorityId() {
        return sysAuthorityId;
    }

    public void setSysAuthorityId(Integer sysAuthorityId) {
        this.sysAuthorityId = sysAuthorityId;
    }
}