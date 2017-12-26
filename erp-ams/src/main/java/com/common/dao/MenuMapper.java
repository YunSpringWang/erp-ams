package com.common.dao;

import java.util.ArrayList;

import com.common.entity.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer wMenuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer wMenuId);
    
    ArrayList<Menu> selectByMenuFatherId(Integer wMenuFatherId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKeyWithBLOBs(Menu record);

    int updateByPrimaryKey(Menu record);
}