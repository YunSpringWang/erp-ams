package com.common.entity;

import java.util.List;

public class SysMenu {
    private Integer menuId;

    private Integer menuFatherId;

    private String menuName;

    private Integer menuType;

    private String menuController;

    private String menuIcon;

    private Integer menuStatus;

    private String menuUrl;

    private String menuDesctiption;
    
    private List<SysMenu> children;

    public List<SysMenu> getChildren() {
		return children;
	}

	public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuFatherId() {
        return menuFatherId;
    }

    public void setMenuFatherId(Integer menuFatherId) {
        this.menuFatherId = menuFatherId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getMenuController() {
        return menuController;
    }

    public void setMenuController(String menuController) {
        this.menuController = menuController == null ? null : menuController.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuDesctiption() {
        return menuDesctiption;
    }

    public void setMenuDesctiption(String menuDesctiption) {
        this.menuDesctiption = menuDesctiption == null ? null : menuDesctiption.trim();
    }

	public void setChildren(List<SysMenu> children) {
		this.children = children;
	}

}