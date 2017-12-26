package com.common.entity;

import java.util.Date;

public class User {
    private String wUserId;

    private String wLoginId;

    private Integer wOrganizationId;

    private String wUserName;

    private Integer wUserSex;

    private Integer wUserAge;

    private String wUserPhone;

    private String wUserTel;

    private String wUserEmail;

    private Date wUserCreatedate;

    private Integer wUserStatus;

    public String getwUserId() {
        return wUserId;
    }

    public void setwUserId(String wUserId) {
        this.wUserId = wUserId == null ? null : wUserId.trim();
    }

    public String getwLoginId() {
        return wLoginId;
    }

    public void setwLoginId(String wLoginId) {
        this.wLoginId = wLoginId == null ? null : wLoginId.trim();
    }

    public Integer getwOrganizationId() {
        return wOrganizationId;
    }

    public void setwOrganizationId(Integer wOrganizationId) {
        this.wOrganizationId = wOrganizationId;
    }

    public String getwUserName() {
        return wUserName;
    }

    public void setwUserName(String wUserName) {
        this.wUserName = wUserName == null ? null : wUserName.trim();
    }

    public Integer getwUserSex() {
        return wUserSex;
    }

    public void setwUserSex(Integer wUserSex) {
        this.wUserSex = wUserSex;
    }

    public Integer getwUserAge() {
        return wUserAge;
    }

    public void setwUserAge(Integer wUserAge) {
        this.wUserAge = wUserAge;
    }

    public String getwUserPhone() {
        return wUserPhone;
    }

    public void setwUserPhone(String wUserPhone) {
        this.wUserPhone = wUserPhone == null ? null : wUserPhone.trim();
    }

    public String getwUserTel() {
        return wUserTel;
    }

    public void setwUserTel(String wUserTel) {
        this.wUserTel = wUserTel == null ? null : wUserTel.trim();
    }

    public String getwUserEmail() {
        return wUserEmail;
    }

    public void setwUserEmail(String wUserEmail) {
        this.wUserEmail = wUserEmail == null ? null : wUserEmail.trim();
    }

    public Date getwUserCreatedate() {
        return wUserCreatedate;
    }

    public void setwUserCreatedate(Date wUserCreatedate) {
        this.wUserCreatedate = wUserCreatedate;
    }

    public Integer getwUserStatus() {
        return wUserStatus;
    }

    public void setwUserStatus(Integer wUserStatus) {
        this.wUserStatus = wUserStatus;
    }
}