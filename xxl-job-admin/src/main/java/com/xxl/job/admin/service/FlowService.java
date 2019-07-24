package com.xxl.job.admin.service;

import org.springframework.stereotype.Service;

/**
 * DATE:   2019-07-23 14:44
 * AUTHOR: simba.hjf
 * DESC:
 **/

public interface FlowService {

    /**
     * 创建新的流,并返回流id
     * @param startJobId
     * @return
     */
    int createNewFlow(int startJobId);
}
