package com.neusoft.common.domain;

import java.util.Date;

/**
 * @author Ghost
 * 出院登记表对应实体类
 */
public class HospitalDischarge  implements java.io.Serializable {

     private String patId;
     private NursePat nursePat;
     private NurseWork nurseWork;
     private Date disTime;
     private String disState;

    public HospitalDischarge() {
    }

    /**
     * @param disState 0：康复出院，1：强制出院,2:死亡
     */
    public HospitalDischarge(NursePat nursePat, NurseWork nurseWork, Date disTime, String disState) {
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
        this.disTime = disTime;
        this.disState = disState;
    }

    public String getPatId() {
        return this.patId;
    }
    
    public void setPatId(String patId) {
        this.patId = patId;
    }

    public NursePat getNursePat() {
        return this.nursePat;
    }
    
    public void setNursePat(NursePat nursePat) {
        this.nursePat = nursePat;
    }

    public NurseWork getNurseWork() {
        return this.nurseWork;
    }
    
    public void setNurseWork(NurseWork nurseWork) {
        this.nurseWork = nurseWork;
    }

    public Date getDisTime() {
        return this.disTime;
    }
    
    /**
     * @param disState 0：康复出院，1：强制出院,2:死亡
     */
    public void setDisTime(Date disTime) {
        this.disTime = disTime;
    }

    public String getDisState() {
        return this.disState;
    }
    
    public void setDisState(String disState) {
        this.disState = disState;
    }
}