package com.common.dao;

import com.common.entity.CodeData;

public interface CodeDataMapper {
    int deleteByPrimaryKey(Integer dataId);

    int insert(CodeData record);

    int insertSelective(CodeData record);

    CodeData selectByPrimaryKey(Integer dataId);

    int updateByPrimaryKeySelective(CodeData record);

    int updateByPrimaryKey(CodeData record);
}