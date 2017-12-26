package com.common.dao;

import com.common.entity.ExpertionLogs;

public interface ExpertionLogsMapper {
    int deleteByPrimaryKey(String wExpertionId);

    int insert(ExpertionLogs record);

    int insertSelective(ExpertionLogs record);

    ExpertionLogs selectByPrimaryKey(String wExpertionId);

    int updateByPrimaryKeySelective(ExpertionLogs record);

    int updateByPrimaryKeyWithBLOBs(ExpertionLogs record);

    int updateByPrimaryKey(ExpertionLogs record);
}