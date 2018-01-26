package com.common.entity;

import java.util.Date;

public class SysRole {
    private Integer roleId;

    private Integer roleFatherId;

    private String roleName;

    private Date roleCreateDate;

    private String roleDescription;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleFatherId() {
        return roleFatherId;
    }

    public void setRoleFatherId(Integer roleFatherId) {
        this.roleFatherId = roleFatherId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Date getRoleCreateDate() {
        return roleCreateDate;
    }

    public void setRoleCreateDate(Date roleCreateDate) {
        this.roleCreateDate = roleCreateDate;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }
}