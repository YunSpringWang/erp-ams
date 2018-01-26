package com.common.dao;

import com.common.entity.SysCode;

public interface SysCodeMapper {
    int deleteByPrimaryKey(String codeId);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    SysCode selectByPrimaryKey(String codeId);

    int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
}