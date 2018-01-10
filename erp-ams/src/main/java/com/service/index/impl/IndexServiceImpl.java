package com.service.index.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.common.entity.AuthorityMenuRelationKey;
import com.common.entity.SysMenu;
import com.service.index.IndexService;

@Repository("indexService")
public class IndexServiceImpl implements IndexService {

	@Override
	public ArrayList<SysMenu> menuList(AuthorityMenuRelationKey authority) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SysMenu> menuListByMenu(Integer wMenuFatherId) {
		// TODO Auto-generated method stub
		return null;
	}
/*
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
*/
}
