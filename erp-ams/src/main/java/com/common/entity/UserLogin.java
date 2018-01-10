package com.common.entity;

import java.util.Date;

public class UserLogin {
    private String loginId;

    private String userId;

    private String loginAccount;

    private String loginPassword;

    private String loginQuestion;

    private String loginAnswer;

    private Integer loginStatus;

    private Date loginCreateDate;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getLoginQuestion() {
        return loginQuestion;
    }

    public void setLoginQuestion(String loginQuestion) {
        this.loginQuestion = loginQuestion == null ? null : loginQuestion.trim();
    }

    public String getLoginAnswer() {
        return loginAnswer;
    }

    public void setLoginAnswer(String loginAnswer) {
        this.loginAnswer = loginAnswer == null ? null : loginAnswer.trim();
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Date getLoginCreateDate() {
        return loginCreateDate;
    }

    public void setLoginCreateDate(Date loginCreateDate) {
        this.loginCreateDate = loginCreateDate;
    }
}