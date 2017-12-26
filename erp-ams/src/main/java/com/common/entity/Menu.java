package com.common.entity;

import java.util.List;

public class Menu {
	private Integer wMenuId;

	private Integer wMenuFatherId;

	private String wMenuName;

	private Integer wMenuType;

	private String wMenuUrl;

	private String wMenuController;

	private String wMenuIcon;

	private Integer wMenuResources;

	private Integer wMenuStatus;

	private String wMenuDescription;

	private List<Menu> children;

	public Menu(Integer wMenuId, Integer wMenuFatherId, String wMenuName, Integer wMenuType, String wMenuUrl,
			String wMenuController, String wMenuIcon, Integer wMenuResources, Integer wMenuStatus,
			String wMenuDescription, List<Menu> children) {
		super();
		this.wMenuId = wMenuId;
		this.wMenuFatherId = wMenuFatherId;
		this.wMenuName = wMenuName;
		this.wMenuType = wMenuType;
		this.wMenuUrl = wMenuUrl;
		this.wMenuController = wMenuController;
		this.wMenuIcon = wMenuIcon;
		this.wMenuResources = wMenuResources;
		this.wMenuStatus = wMenuStatus;
		this.wMenuDescription = wMenuDescription;
		this.children = children;
	}
	public Menu() {
		super();
	}

	public Integer getwMenuId() {
		return wMenuId;
	}

	public void setwMenuId(Integer wMenuId) {
		this.wMenuId = wMenuId;
	}

	public Integer getwMenuFatherId() {
		return wMenuFatherId;
	}

	public void setwMenuFatherId(Integer wMenuFatherId) {
		this.wMenuFatherId = wMenuFatherId;
	}

	public String getwMenuName() {
		return wMenuName;
	}

	public void setwMenuName(String wMenuName) {
		this.wMenuName = wMenuName == null ? null : wMenuName.trim();
	}

	public Integer getwMenuType() {
		return wMenuType;
	}

	public void setwMenuType(Integer wMenuType) {
		this.wMenuType = wMenuType;
	}

	public String getwMenuUrl() {
		return wMenuUrl;
	}

	public void setwMenuUrl(String wMenuUrl) {
		this.wMenuUrl = wMenuUrl == null ? null : wMenuUrl.trim();
	}

	public String getwMenuController() {
		return wMenuController;
	}

	public void setwMenuController(String wMenuController) {
		this.wMenuController = wMenuController == null ? null : wMenuController.trim();
	}

	public String getwMenuIcon() {
		return wMenuIcon;
	}

	public void setwMenuIcon(String wMenuIcon) {
		this.wMenuIcon = wMenuIcon == null ? null : wMenuIcon.trim();
	}

	public Integer getwMenuResources() {
		return wMenuResources;
	}

	public void setwMenuResources(Integer wMenuResources) {
		this.wMenuResources = wMenuResources;
	}

	public Integer getwMenuStatus() {
		return wMenuStatus;
	}

	public void setwMenuStatus(Integer wMenuStatus) {
		this.wMenuStatus = wMenuStatus;
	}

	public String getwMenuDescription() {
		return wMenuDescription;
	}

	public void setwMenuDescription(String wMenuDescription) {
		this.wMenuDescription = wMenuDescription == null ? null : wMenuDescription.trim();
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Menu [wMenuId=" + wMenuId + ", wMenuFatherId=" + wMenuFatherId + ", wMenuName=" + wMenuName
				+ ", wMenuType=" + wMenuType + ", wMenuUrl=" + wMenuUrl + ", wMenuController=" + wMenuController
				+ ", wMenuIcon=" + wMenuIcon + ", wMenuResources=" + wMenuResources + ", wMenuStatus=" + wMenuStatus
				+ ", wMenuDescription=" + wMenuDescription + ", children=" + children + "]";
	}


}