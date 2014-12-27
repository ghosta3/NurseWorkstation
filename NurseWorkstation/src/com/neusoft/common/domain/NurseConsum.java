package com.neusoft.common.domain;

import java.util.Date;


/**
 * 住院消费表对应实体类
 * @author Ghost
 */

public class NurseConsum  implements java.io.Serializable {

     private String conId;
     private NursePat nursePat;
     private Double conCost;
     private Date beginTime;

    public NurseConsum() {
    }

    public NurseConsum(NursePat nursePat, Date beginTime) {
        this.nursePat = nursePat;
        this.beginTime = beginTime;
    }

    public NurseConsum(NursePat nursePat, Double conCost, Date beginTime) {
        this.nursePat = nursePat;
        this.conCost = conCost;
        this.beginTime = beginTime;
    }

    public String getConId() {
        return this.conId;
    }
    
    public void setConId(String conId) {
        this.conId = conId;
    }

    public NursePat getNursePat() {
        return this.nursePat;
    }
    
    public void setNursePat(NursePat nursePat) {
        this.nursePat = nursePat;
    }

    public Double getConCost() {
        return this.conCost;
    }
    
    public void setConCost(Double conCost) {
        this.conCost = conCost;
    }

    public Date getBeginTime() {
        return this.beginTime;
    }
    
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
}