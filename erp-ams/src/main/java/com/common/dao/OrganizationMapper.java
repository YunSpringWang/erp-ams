package com.common.dao;

import com.common.entity.Organization;

public interface OrganizationMapper {
    int deleteByPrimaryKey(Integer wOrganizationId);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Integer wOrganizationId);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKeyWithBLOBs(Organization record);

    int updateByPrimaryKey(Organization record);
}