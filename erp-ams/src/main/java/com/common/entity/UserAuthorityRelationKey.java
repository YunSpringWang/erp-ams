package com.common.entity;

public class UserAuthorityRelationKey {
    private String wUserId;

    private Integer wAuthorityId;

    public String getwUserId() {
        return wUserId;
    }

    public void setwUserId(String wUserId) {
        this.wUserId = wUserId == null ? null : wUserId.trim();
    }

    public Integer getwAuthorityId() {
        return wAuthorityId;
    }

    public void setwAuthorityId(Integer wAuthorityId) {
        this.wAuthorityId = wAuthorityId;
    }
}