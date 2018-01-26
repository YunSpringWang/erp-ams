package com.common.dao;

import com.common.entity.SysOrganization;

public interface SysOrganizationMapper {
    int deleteByPrimaryKey(Integer orgId);

    int insert(SysOrganization record);

    int insertSelective(SysOrganization record);

    SysOrganization selectByPrimaryKey(Integer orgId);

    int updateByPrimaryKeySelective(SysOrganization record);

    int updateByPrimaryKeyWithBLOBs(SysOrganization record);

    int updateByPrimaryKey(SysOrganization record);
}