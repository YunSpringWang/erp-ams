package com.common.dao;

import java.util.ArrayList;

import com.common.entity.AuthorityMenuKey;

public interface AuthorityMenuMapper {
    int deleteByPrimaryKey(AuthorityMenuKey key);

    int insert(AuthorityMenuKey record);

    int insertSelective(AuthorityMenuKey record);
    
    ArrayList<AuthorityMenuKey> selectMenuIdByAuthorityId(Integer wAuthorityId);
    
    
}