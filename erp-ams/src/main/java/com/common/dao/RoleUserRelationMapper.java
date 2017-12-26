package com.common.dao;

import com.common.entity.RoleUserRelationKey;

public interface RoleUserRelationMapper {
    int deleteByPrimaryKey(RoleUserRelationKey key);

    int insert(RoleUserRelationKey record);

    int insertSelective(RoleUserRelationKey record);
}