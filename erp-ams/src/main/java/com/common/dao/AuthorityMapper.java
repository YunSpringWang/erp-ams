package com.common.dao;

import com.common.entity.Authority;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Integer wAuthorityId);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer wAuthorityId);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKeyWithBLOBs(Authority record);

    int updateByPrimaryKey(Authority record);
}