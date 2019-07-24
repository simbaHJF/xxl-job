package com.xxl.job.admin.core.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * DATE:   2019-07-23 15:17
 * AUTHOR: simba.hjf
 * DESC:
 **/
public class XxlJobFlow {
    private int id;
    private int startJobId;
    private Date addTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartJobId() {
        return startJobId;
    }

    public void setStartJobId(int startJobId) {
        this.startJobId = startJobId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
