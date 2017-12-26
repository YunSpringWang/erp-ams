package com.common.dao;

import com.common.entity.UserAuthorityRelationKey;

public interface UserAuthorityRelationMapper {
    int deleteByPrimaryKey(UserAuthorityRelationKey key);

    int insert(UserAuthorityRelationKey record);

    int insertSelective(UserAuthorityRelationKey record);
}