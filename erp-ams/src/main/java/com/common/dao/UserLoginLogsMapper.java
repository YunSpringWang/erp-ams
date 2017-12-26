package com.common.dao;

import com.common.entity.UserLoginLogs;

public interface UserLoginLogsMapper {
    int deleteByPrimaryKey(String wLoginLogsId);

    int insert(UserLoginLogs record);

    int insertSelective(UserLoginLogs record);

    UserLoginLogs selectByPrimaryKey(String wLoginLogsId);

    int updateByPrimaryKeySelective(UserLoginLogs record);

    int updateByPrimaryKeyWithBLOBs(UserLoginLogs record);

    int updateByPrimaryKey(UserLoginLogs record);
}