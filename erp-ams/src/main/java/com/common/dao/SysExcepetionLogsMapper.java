package com.common.dao;

import com.common.entity.SysExcepetionLogs;

public interface SysExcepetionLogsMapper {
    int deleteByPrimaryKey(String excepetionId);

    int insert(SysExcepetionLogs record);

    int insertSelective(SysExcepetionLogs record);

    SysExcepetionLogs selectByPrimaryKey(String excepetionId);

    int updateByPrimaryKeySelective(SysExcepetionLogs record);

    int updateByPrimaryKeyWithBLOBs(SysExcepetionLogs record);

    int updateByPrimaryKey(SysExcepetionLogs record);
}