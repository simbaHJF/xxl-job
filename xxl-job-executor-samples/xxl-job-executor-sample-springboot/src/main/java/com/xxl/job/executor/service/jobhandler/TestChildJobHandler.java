package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * DATE:   2019-07-26 10:21
 * AUTHOR: simba.hjf
 * DESC:
 **/
@Component
@JobHandler("testChildJobHandler")
public class TestChildJobHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        XxlJobLogger.log("child job.");
        System.out.println("child job.");
        return SUCCESS;
    }
}
