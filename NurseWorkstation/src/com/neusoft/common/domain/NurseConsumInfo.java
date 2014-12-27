package com.neusoft.common.domain;

import java.util.Date;


/**
 * 消费明细表对应实体类
 * @author Ghost
 */

public class NurseConsumInfo  implements java.io.Serializable {

     private String consumInfoId;
     private NurseDrug nurseDrug;
     private NursePat nursePat;
     private Short drugNum;
     private Double otherCost;
     private Date constTime;

    public NurseConsumInfo() {
    }

    public NurseConsumInfo(NurseDrug nurseDrug, NursePat nursePat, Date constTime) {
        this.nurseDrug = nurseDrug;
        this.nursePat = nursePat;
        this.constTime = constTime;
    }
    
    public NurseConsumInfo(NurseDrug nurseDrug, NursePat nursePat, Short drugNum, Double otherCost, Date constTime) {
        this.nurseDrug = nurseDrug;
        this.nursePat = nursePat;
        this.drugNum = drugNum;
        this.otherCost = otherCost;
        this.constTime = constTime;
    }

    public String getConsumInfoId() {
        return this.consumInfoId;
    }
    
    /**
     * @param consumInfoId length=21 病人ID，日期合为主键
     */
    public void setConsumInfoId(String consumInfoId) {
        this.consumInfoId = consumInfoId;
    }

    public NurseDrug getNurseDrug() {
        return this.nurseDrug;
    }
    
    public void setNurseDrug(NurseDrug nurseDrug) {
        this.nurseDrug = nurseDrug;
    }

    public NursePat getNursePat() {
        return this.nursePat;
    }
    
    public void setNursePat(NursePat nursePat) {
        this.nursePat = nursePat;
    }

    public Short getDrugNum() {
        return this.drugNum;
    }
    
    public void setDrugNum(Short drugNum) {
        this.drugNum = drugNum;
    }

    public Double getOtherCost() {
        return this.otherCost;
    }
    
    public void setOtherCost(Double otherCost) {
        this.otherCost = otherCost;
    }

    public Date getConstTime() {
        return this.constTime;
    }
    
    public void setConstTime(Date constTime) {
        this.constTime = constTime;
    }
}