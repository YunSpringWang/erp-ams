package com.common.dao;

import com.common.entity.SysAuthority;

public interface SysAuthorityMapper {
    int deleteByPrimaryKey(Integer sysAuthorityId);

    int insert(SysAuthority record);

    int insertSelective(SysAuthority record);

    SysAuthority selectByPrimaryKey(Integer sysAuthorityId);

    int updateByPrimaryKeySelective(SysAuthority record);

    int updateByPrimaryKeyWithBLOBs(SysAuthority record);

    int updateByPrimaryKey(SysAuthority record);
}