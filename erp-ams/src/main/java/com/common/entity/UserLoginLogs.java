package com.common.entity;

import java.util.Date;

public class UserLoginLogs {
    private String wLoginLogsId;

    private String wLoginId;

    private String wLoginLogsIp;

    private String wLoginLogsMac;

    private Integer wLoginLogsSystype;

    private Date wLoginLogsCreatedate;

    private String wLoginLogsDescription;

    public String getwLoginLogsId() {
        return wLoginLogsId;
    }

    public void setwLoginLogsId(String wLoginLogsId) {
        this.wLoginLogsId = wLoginLogsId == null ? null : wLoginLogsId.trim();
    }

    public String getwLoginId() {
        return wLoginId;
    }

    public void setwLoginId(String wLoginId) {
        this.wLoginId = wLoginId == null ? null : wLoginId.trim();
    }

    public String getwLoginLogsIp() {
        return wLoginLogsIp;
    }

    public void setwLoginLogsIp(String wLoginLogsIp) {
        this.wLoginLogsIp = wLoginLogsIp == null ? null : wLoginLogsIp.trim();
    }

    public String getwLoginLogsMac() {
        return wLoginLogsMac;
    }

    public void setwLoginLogsMac(String wLoginLogsMac) {
        this.wLoginLogsMac = wLoginLogsMac == null ? null : wLoginLogsMac.trim();
    }

    public Integer getwLoginLogsSystype() {
        return wLoginLogsSystype;
    }

    public void setwLoginLogsSystype(Integer wLoginLogsSystype) {
        this.wLoginLogsSystype = wLoginLogsSystype;
    }

    public Date getwLoginLogsCreatedate() {
        return wLoginLogsCreatedate;
    }

    public void setwLoginLogsCreatedate(Date wLoginLogsCreatedate) {
        this.wLoginLogsCreatedate = wLoginLogsCreatedate;
    }

    public String getwLoginLogsDescription() {
        return wLoginLogsDescription;
    }

    public void setwLoginLogsDescription(String wLoginLogsDescription) {
        this.wLoginLogsDescription = wLoginLogsDescription == null ? null : wLoginLogsDescription.trim();
    }
}