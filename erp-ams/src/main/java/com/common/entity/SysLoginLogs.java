package com.common.entity;

import java.util.Date;

public class SysLoginLogs {
    private String sysLoginLogsId;

    private String loginId;

    private String sysLoginLogsIp;

    private String sysLoginLogsMac;

    private Integer sysLoginLogsSystype;

    private Date sysLoginLogsCreateDate;

    private String sysLoginLogsDescription;

    public String getSysLoginLogsId() {
        return sysLoginLogsId;
    }

    public void setSysLoginLogsId(String sysLoginLogsId) {
        this.sysLoginLogsId = sysLoginLogsId == null ? null : sysLoginLogsId.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getSysLoginLogsIp() {
        return sysLoginLogsIp;
    }

    public void setSysLoginLogsIp(String sysLoginLogsIp) {
        this.sysLoginLogsIp = sysLoginLogsIp == null ? null : sysLoginLogsIp.trim();
    }

    public String getSysLoginLogsMac() {
        return sysLoginLogsMac;
    }

    public void setSysLoginLogsMac(String sysLoginLogsMac) {
        this.sysLoginLogsMac = sysLoginLogsMac == null ? null : sysLoginLogsMac.trim();
    }

    public Integer getSysLoginLogsSystype() {
        return sysLoginLogsSystype;
    }

    public void setSysLoginLogsSystype(Integer sysLoginLogsSystype) {
        this.sysLoginLogsSystype = sysLoginLogsSystype;
    }

    public Date getSysLoginLogsCreateDate() {
        return sysLoginLogsCreateDate;
    }

    public void setSysLoginLogsCreateDate(Date sysLoginLogsCreateDate) {
        this.sysLoginLogsCreateDate = sysLoginLogsCreateDate;
    }

    public String getSysLoginLogsDescription() {
        return sysLoginLogsDescription;
    }

    public void setSysLoginLogsDescription(String sysLoginLogsDescription) {
        this.sysLoginLogsDescription = sysLoginLogsDescription == null ? null : sysLoginLogsDescription.trim();
    }
}