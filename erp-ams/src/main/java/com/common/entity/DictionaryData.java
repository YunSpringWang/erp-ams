package com.common.entity;

public class DictionaryData {
    private Integer wDataId;

    private String wDescriptionId;

    private String wDataName;

    public Integer getwDataId() {
        return wDataId;
    }

    public void setwDataId(Integer wDataId) {
        this.wDataId = wDataId;
    }

    public String getwDescriptionId() {
        return wDescriptionId;
    }

    public void setwDescriptionId(String wDescriptionId) {
        this.wDescriptionId = wDescriptionId == null ? null : wDescriptionId.trim();
    }

    public String getwDataName() {
        return wDataName;
    }

    public void setwDataName(String wDataName) {
        this.wDataName = wDataName == null ? null : wDataName.trim();
    }
}