package com.common.entity;

import java.util.Date;

public class ExpertionLogs {
    private String wExpertionId;

    private String wLoginId;

    private String wExpertionClass;

    private String wExpertionMethod;

    private Integer wExpertionType;

    private Date wExpertionTime;

    private Integer wExpertionStatus;

    private String wExpertionContent;

    public String getwExpertionId() {
        return wExpertionId;
    }

    public void setwExpertionId(String wExpertionId) {
        this.wExpertionId = wExpertionId == null ? null : wExpertionId.trim();
    }

    public String getwLoginId() {
        return wLoginId;
    }

    public void setwLoginId(String wLoginId) {
        this.wLoginId = wLoginId == null ? null : wLoginId.trim();
    }

    public String getwExpertionClass() {
        return wExpertionClass;
    }

    public void setwExpertionClass(String wExpertionClass) {
        this.wExpertionClass = wExpertionClass == null ? null : wExpertionClass.trim();
    }

    public String getwExpertionMethod() {
        return wExpertionMethod;
    }

    public void setwExpertionMethod(String wExpertionMethod) {
        this.wExpertionMethod = wExpertionMethod == null ? null : wExpertionMethod.trim();
    }

    public Integer getwExpertionType() {
        return wExpertionType;
    }

    public void setwExpertionType(Integer wExpertionType) {
        this.wExpertionType = wExpertionType;
    }

    public Date getwExpertionTime() {
        return wExpertionTime;
    }

    public void setwExpertionTime(Date wExpertionTime) {
        this.wExpertionTime = wExpertionTime;
    }

    public Integer getwExpertionStatus() {
        return wExpertionStatus;
    }

    public void setwExpertionStatus(Integer wExpertionStatus) {
        this.wExpertionStatus = wExpertionStatus;
    }

    public String getwExpertionContent() {
        return wExpertionContent;
    }

    public void setwExpertionContent(String wExpertionContent) {
        this.wExpertionContent = wExpertionContent == null ? null : wExpertionContent.trim();
    }
}