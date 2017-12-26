package com.common.entity;

import java.util.Date;

public class Role {
    private Integer wRoleId;

    private Integer wRoleFatherId;

    private String wRoleName;

    private Date wRoleCreatedate;

    private String wRoleDescription;

    public Integer getwRoleId() {
        return wRoleId;
    }

    public void setwRoleId(Integer wRoleId) {
        this.wRoleId = wRoleId;
    }

    public Integer getwRoleFatherId() {
        return wRoleFatherId;
    }

    public void setwRoleFatherId(Integer wRoleFatherId) {
        this.wRoleFatherId = wRoleFatherId;
    }

    public String getwRoleName() {
        return wRoleName;
    }

    public void setwRoleName(String wRoleName) {
        this.wRoleName = wRoleName == null ? null : wRoleName.trim();
    }

    public Date getwRoleCreatedate() {
        return wRoleCreatedate;
    }

    public void setwRoleCreatedate(Date wRoleCreatedate) {
        this.wRoleCreatedate = wRoleCreatedate;
    }

    public String getwRoleDescription() {
        return wRoleDescription;
    }

    public void setwRoleDescription(String wRoleDescription) {
        this.wRoleDescription = wRoleDescription == null ? null : wRoleDescription.trim();
    }
}