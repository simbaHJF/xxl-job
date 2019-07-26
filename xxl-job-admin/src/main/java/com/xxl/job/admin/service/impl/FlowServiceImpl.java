package com.xxl.job.admin.service.impl;

import com.xxl.job.admin.core.model.XxlJobFlow;
import com.xxl.job.admin.dao.XxlJobFlowDao;
import com.xxl.job.admin.service.FlowService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * DATE:   2019-07-23 14:56
 * AUTHOR: simba.hjf
 * DESC:
 **/
@Service
public class FlowServiceImpl implements FlowService {
    @Resource
    XxlJobFlowDao xxlJobFlowDao;

    @Override
    @Transactional
    public int createNewFlow(int startJobId) {
        /*xxlJobFlowDao.selectToLockTableXxlJobFlow();*/
        XxlJobFlow xxlJobFlow = new XxlJobFlow();
        xxlJobFlow.setStartJobId(startJobId);
        xxlJobFlowDao.insertFlow(xxlJobFlow);
        /*int flowId = xxlJobFlowDao.selectMaxIdOfTableXxlJobFlow();*/
        return xxlJobFlow.getId();
    }
}
