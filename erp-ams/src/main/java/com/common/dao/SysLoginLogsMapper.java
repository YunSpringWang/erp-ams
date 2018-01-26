package com.common.dao;

import java.util.ArrayList;

import com.common.entity.SysLoginLogs;

public interface SysLoginLogsMapper {
    int deleteByPrimaryKey(String sysLoginLogsId);

    int insert(SysLoginLogs record);

    int insertSelective(SysLoginLogs record);

    SysLoginLogs selectByPrimaryKey(String sysLoginLogsId);

    int updateByPrimaryKeySelective(SysLoginLogs record);

    int updateByPrimaryKeyWithBLOBs(SysLoginLogs record);

    int updateByPrimaryKey(SysLoginLogs record);
    
    ArrayList<SysLoginLogs> getListSysLoginLogs(SysLoginLogs record);
}