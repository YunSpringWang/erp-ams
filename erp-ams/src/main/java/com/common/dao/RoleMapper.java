package com.common.dao;

import com.common.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer wRoleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer wRoleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKeyWithBLOBs(Role record);

    int updateByPrimaryKey(Role record);
}