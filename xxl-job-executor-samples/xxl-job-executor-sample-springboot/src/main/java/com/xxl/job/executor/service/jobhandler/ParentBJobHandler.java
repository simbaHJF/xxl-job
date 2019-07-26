package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * DATE:   2019-07-26 17:09
 * AUTHOR: simba.hjf
 * DESC:
 **/
@Component
@JobHandler("parentBJobHandler")
public class ParentBJobHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("ParentBJobHandler job sleep 10s" + LocalDateTime.now());
        Thread.sleep(10000);
        System.out.println("ParentBJobHandler job end" + LocalDateTime.now());
        return IJobHandler.SUCCESS;
    }
}
