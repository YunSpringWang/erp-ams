package com.service.index.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.common.dao.AuthorityMenuMapper;
import com.common.dao.MenuMapper;
import com.common.entity.AuthorityMenuKey;
import com.common.entity.Menu;
import com.service.index.IndexService;

@Repository("IndexService")
public class IndexServiceImpl implements IndexService {

	@Autowired
	private MenuMapper menuMapper;
	@Autowired
	private AuthorityMenuMapper authorityMenuMapper;

	@Override
	public ArrayList<Menu> menuList(AuthorityMenuKey authority) {
		ArrayList<Menu> menulist = new ArrayList<Menu>();
		ArrayList<AuthorityMenuKey> authorityMenuKeyList = authorityMenuMapper
				.selectMenuIdByAuthorityId(authority.getwAuthorityId());
		for (AuthorityMenuKey authorityMenuKey : authorityMenuKeyList) {
			Menu menu = menuMapper.selectByPrimaryKey(authorityMenuKey.getwMenuId());
			menulist.add(menu);
		}
		return menulist;
	}

	@Override
	public ArrayList<Menu> menuListByMenu(Integer wMenuId) {
		ArrayList<Menu> menulist = new ArrayList<Menu>();
		menulist = menuMapper.selectByMenuFatherId(wMenuId);	
		return menulist;
	}

}
