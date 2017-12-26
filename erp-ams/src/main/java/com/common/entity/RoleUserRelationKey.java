package com.common.entity;

public class RoleUserRelationKey {
    private Integer wRoleId;

    private String wUserId;

    public Integer getwRoleId() {
        return wRoleId;
    }

    public void setwRoleId(Integer wRoleId) {
        this.wRoleId = wRoleId;
    }

    public String getwUserId() {
        return wUserId;
    }

    public void setwUserId(String wUserId) {
        this.wUserId = wUserId == null ? null : wUserId.trim();
    }
}