package com.common.dao;

import com.common.entity.OrganizationAuthorityRelationKey;

public interface OrganizationAuthorityRelationMapper {
    int deleteByPrimaryKey(OrganizationAuthorityRelationKey key);

    int insert(OrganizationAuthorityRelationKey record);

    int insertSelective(OrganizationAuthorityRelationKey record);
}