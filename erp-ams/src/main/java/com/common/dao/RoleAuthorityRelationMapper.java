package com.common.dao;

import com.common.entity.RoleAuthorityRelationKey;

public interface RoleAuthorityRelationMapper {
    int deleteByPrimaryKey(RoleAuthorityRelationKey key);

    int insert(RoleAuthorityRelationKey record);

    int insertSelective(RoleAuthorityRelationKey record);
}