package com.service.index;

import java.util.ArrayList;

import com.common.entity.AuthorityMenuRelationKey;
import com.common.entity.SysMenu;

public interface IndexService {

	/**
	 * 查询菜单列表
	 * @return
	 */
	public ArrayList<SysMenu> menuList(AuthorityMenuRelationKey authority);
	
	public ArrayList<SysMenu> menuListByMenu(Integer wMenuFatherId);
}
