package com.service.index;

import java.util.ArrayList;

import com.common.entity.AuthorityMenuKey;
import com.common.entity.Menu;

public interface IndexService {

	/**
	 * 查询菜单列表
	 * @return
	 */
	public ArrayList<Menu> menuList(AuthorityMenuKey authority);
	
	public ArrayList<Menu> menuListByMenu(Integer wMenuFatherId);
}
