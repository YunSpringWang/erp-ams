package com.common.entity;

public class Dictionary {
    private String wDescriptionId;

    private String wCode;

    private String wCodeName;

    public String getwDescriptionId() {
        return wDescriptionId;
    }

    public void setwDescriptionId(String wDescriptionId) {
        this.wDescriptionId = wDescriptionId == null ? null : wDescriptionId.trim();
    }

    public String getwCode() {
        return wCode;
    }

    public void setwCode(String wCode) {
        this.wCode = wCode == null ? null : wCode.trim();
    }

    public String getwCodeName() {
        return wCodeName;
    }

    public void setwCodeName(String wCodeName) {
        this.wCodeName = wCodeName == null ? null : wCodeName.trim();
    }
}