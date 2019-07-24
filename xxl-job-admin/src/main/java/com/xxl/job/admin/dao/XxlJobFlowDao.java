package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobFlow;
import org.apache.ibatis.annotations.Mapper;

/**
 * DATE:   2019-07-23 14:54
 * AUTHOR: simba.hjf
 * DESC:
 **/

@Mapper
public interface XxlJobFlowDao {


    int selectToLockTableXxlJobFlow();

    int selectMaxIdOfTableXxlJobFlow();

    int insertFlow(XxlJobFlow xxlJobFlow);
}
