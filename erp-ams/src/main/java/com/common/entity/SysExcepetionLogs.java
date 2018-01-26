package com.common.entity;

import java.util.Date;

public class SysExcepetionLogs {
    private String excepetionId;

    private String loginId;

    private String excepetionClass;

    private String excepetionMethod;

    private Integer excepetionType;

    private Date excepetionTime;

    private Integer excepetionStatus;

    private String excepetionContent;

    public String getExcepetionId() {
        return excepetionId;
    }

    public void setExcepetionId(String excepetionId) {
        this.excepetionId = excepetionId == null ? null : excepetionId.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getExcepetionClass() {
        return excepetionClass;
    }

    public void setExcepetionClass(String excepetionClass) {
        this.excepetionClass = excepetionClass == null ? null : excepetionClass.trim();
    }

    public String getExcepetionMethod() {
        return excepetionMethod;
    }

    public void setExcepetionMethod(String excepetionMethod) {
        this.excepetionMethod = excepetionMethod == null ? null : excepetionMethod.trim();
    }

    public Integer getExcepetionType() {
        return excepetionType;
    }

    public void setExcepetionType(Integer excepetionType) {
        this.excepetionType = excepetionType;
    }

    public Date getExcepetionTime() {
        return excepetionTime;
    }

    public void setExcepetionTime(Date excepetionTime) {
        this.excepetionTime = excepetionTime;
    }

    public Integer getExcepetionStatus() {
        return excepetionStatus;
    }

    public void setExcepetionStatus(Integer excepetionStatus) {
        this.excepetionStatus = excepetionStatus;
    }

    public String getExcepetionContent() {
        return excepetionContent;
    }

    public void setExcepetionContent(String excepetionContent) {
        this.excepetionContent = excepetionContent == null ? null : excepetionContent.trim();
    }
}