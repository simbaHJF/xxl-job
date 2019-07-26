package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * DATE:   2019-07-26 10:17
 * AUTHOR: simba.hjf
 * DESC:
 **/
@Component
@JobHandler("testParentJobHandler")
public class TestParentJobHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        XxlJobLogger.log("parent job.sleep 5s");
        System.out.println("parent job.sleep 5s");
        Thread.sleep(5000);
        return SUCCESS;
    }
}
