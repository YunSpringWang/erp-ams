package com.common.dao;

import com.common.entity.RoleOrgRelationKey;

public interface RoleOrgRelationMapper {
    int deleteByPrimaryKey(RoleOrgRelationKey key);

    int insert(RoleOrgRelationKey record);

    int insertSelective(RoleOrgRelationKey record);
}