package com.common.dao;

import com.common.entity.Dictionary;

public interface DictionaryMapper {
    int deleteByPrimaryKey(String wDescriptionId);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(String wDescriptionId);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}