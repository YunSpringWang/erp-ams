package com.common.entity;

import java.util.Date;

public class UserLogin {
    private String wLoginId;

    private String wUserId;

    private String wLoginAccount;

    private String wLoginPassword;

    private String wLoginQuestion;

    private String wLoginAnswer;

    private Integer wLoginStatus;

    private Date wLoginCreatetime;

    public String getwLoginId() {
        return wLoginId;
    }

    public void setwLoginId(String wLoginId) {
        this.wLoginId = wLoginId == null ? null : wLoginId.trim();
    }

    public String getwUserId() {
        return wUserId;
    }

    public void setwUserId(String wUserId) {
        this.wUserId = wUserId == null ? null : wUserId.trim();
    }

    public String getwLoginAccount() {
        return wLoginAccount;
    }

    public void setwLoginAccount(String wLoginAccount) {
        this.wLoginAccount = wLoginAccount == null ? null : wLoginAccount.trim();
    }

    public String getwLoginPassword() {
        return wLoginPassword;
    }

    public void setwLoginPassword(String wLoginPassword) {
        this.wLoginPassword = wLoginPassword == null ? null : wLoginPassword.trim();
    }

    public String getwLoginQuestion() {
        return wLoginQuestion;
    }

    public void setwLoginQuestion(String wLoginQuestion) {
        this.wLoginQuestion = wLoginQuestion == null ? null : wLoginQuestion.trim();
    }

    public String getwLoginAnswer() {
        return wLoginAnswer;
    }

    public void setwLoginAnswer(String wLoginAnswer) {
        this.wLoginAnswer = wLoginAnswer == null ? null : wLoginAnswer.trim();
    }

    public Integer getwLoginStatus() {
        return wLoginStatus;
    }

    public void setwLoginStatus(Integer wLoginStatus) {
        this.wLoginStatus = wLoginStatus;
    }

    public Date getwLoginCreatetime() {
        return wLoginCreatetime;
    }

    public void setwLoginCreatetime(Date wLoginCreatetime) {
        this.wLoginCreatetime = wLoginCreatetime;
    }
}