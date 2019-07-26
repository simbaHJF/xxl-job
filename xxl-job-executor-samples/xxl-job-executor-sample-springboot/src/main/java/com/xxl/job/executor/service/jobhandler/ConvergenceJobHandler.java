package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * DATE:   2019-07-26 17:12
 * AUTHOR: simba.hjf
 * DESC:
 **/

@Component
@JobHandler("convergenceJobHandler")
public class ConvergenceJobHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("ConvergenceJobHandler job" + LocalDateTime.now());
        return IJobHandler.SUCCESS;
    }
}
