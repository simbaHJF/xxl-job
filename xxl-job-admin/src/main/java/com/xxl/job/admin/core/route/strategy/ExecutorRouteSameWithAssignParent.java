package com.xxl.job.admin.core.route.strategy;

import com.xxl.job.admin.core.conf.XxlJobAdminConfig;
import com.xxl.job.admin.core.model.XxlJobInfo;
import com.xxl.job.admin.core.model.XxlJobLog;
import com.xxl.job.admin.core.route.ExecutorRouter;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.biz.model.TriggerParam;

import java.util.List;

/**
 * DATE:   2019-07-23 15:45
 * AUTHOR: simba.hjf
 * DESC:
 **/
public class ExecutorRouteSameWithAssignParent extends ExecutorRouter {
    @Override
    public ReturnT<String> route(TriggerParam triggerParam, List<String> addressList) {

        XxlJobInfo xxlJobInfo = XxlJobAdminConfig.getAdminConfig().getXxlJobInfoDao().loadById(triggerParam.getJobId());
        String routeStrategy = xxlJobInfo.getExecutorRouteStrategy();
        String[] arr = routeStrategy.split(":");
        if (arr.length != 2) {
            throw new RuntimeException("ExecutorRouteSameWithAssignParent error,routeStrategy str format illegal.jobId:" + xxlJobInfo.getId());
        }
        int parentJobId = Integer.parseInt(arr[1]);
        XxlJobLog xxlJobLog = XxlJobAdminConfig.getAdminConfig().getXxlJobLogDao().load(triggerParam.getLogId());
        int flowId = xxlJobLog.getFlowId();
        XxlJobLog parentJobLog = XxlJobAdminConfig.getAdminConfig().getXxlJobLogDao().selectJobLogByJobIdAndFlowId(parentJobId, flowId);
        return new ReturnT<>(parentJobLog.getExecutorAddress());
    }
}
