package com.common.dao;

import com.common.entity.RoleOrganizationRelationKey;

public interface RoleOrganizationRelationMapper {
    int deleteByPrimaryKey(RoleOrganizationRelationKey key);

    int insert(RoleOrganizationRelationKey record);

    int insertSelective(RoleOrganizationRelationKey record);
}