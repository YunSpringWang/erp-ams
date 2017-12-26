package com.common.dao;

import com.common.entity.DictionaryData;

public interface DictionaryDataMapper {
    int deleteByPrimaryKey(Integer wDataId);

    int insert(DictionaryData record);

    int insertSelective(DictionaryData record);

    DictionaryData selectByPrimaryKey(Integer wDataId);

    int updateByPrimaryKeySelective(DictionaryData record);

    int updateByPrimaryKey(DictionaryData record);
}