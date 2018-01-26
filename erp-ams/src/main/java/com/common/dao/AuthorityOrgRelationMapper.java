package com.common.dao;

import com.common.entity.AuthorityOrgRelationKey;

public interface AuthorityOrgRelationMapper {
    int deleteByPrimaryKey(AuthorityOrgRelationKey key);

    int insert(AuthorityOrgRelationKey record);

    int insertSelective(AuthorityOrgRelationKey record);
}