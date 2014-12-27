package com.neusoft.common.domain;

import java.util.Date;


/**
 * 住院登记表对应实体类
 * @author Ghost
 * 
 */

public class NurseBegin  implements java.io.Serializable {

     private Integer beginId;
     private OfficeDepartment officeDepartment;
     private NurseBed nurseBed;
     private NursePat nursePat;
     private NurseWork nurseWork;
     private Date beginTime;
     private Double depoMoney;
     private Double leftMoney;

    public NurseBegin() {
    }

    public NurseBegin(OfficeDepartment officeDepartment, NurseBed nurseBed, NursePat nursePat, NurseWork nurseWork) {
        this.officeDepartment = officeDepartment;
        this.nurseBed = nurseBed;
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
    }
    
    public NurseBegin(OfficeDepartment officeDepartment, NurseBed nurseBed, NursePat nursePat, NurseWork nurseWork, Date beginTime, Double depoMoney, Double leftMoney) {
        this.officeDepartment = officeDepartment;
        this.nurseBed = nurseBed;
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
        this.beginTime = beginTime;
        this.depoMoney = depoMoney;
        this.leftMoney = leftMoney;
    }

    public Integer getBeginId() {
        return this.beginId;
    }
    
    public void setBeginId(Integer beginId) {
        this.beginId = beginId;
    }

    public OfficeDepartment getOfficeDepartment() {
        return this.officeDepartment;
    }
    
    public void setOfficeDepartment(OfficeDepartment officeDepartment) {
        this.officeDepartment = officeDepartment;
    }

    public NurseBed getNurseBed() {
        return this.nurseBed;
    }
    
    public void setNurseBed(NurseBed nurseBed) {
        this.nurseBed = nurseBed;
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

    public Date getBeginTime() {
        return this.beginTime;
    }
    
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Double getDepoMoney() {
        return this.depoMoney;
    }
    
    public void setDepoMoney(Double depoMoney) {
        this.depoMoney = depoMoney;
    }

    public Double getLeftMoney() {
        return this.leftMoney;
    }
    
    public void setLeftMoney(Double leftMoney) {
        this.leftMoney = leftMoney;
    }
   
}