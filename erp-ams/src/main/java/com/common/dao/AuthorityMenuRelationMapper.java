package com.common.dao;

import com.common.entity.AuthorityMenuRelationKey;

public interface AuthorityMenuRelationMapper {
    int deleteByPrimaryKey(AuthorityMenuRelationKey key);

    int insert(AuthorityMenuRelationKey record);

    int insertSelective(AuthorityMenuRelationKey record);
}