package com.neusoft.common.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * @author Ghost
 * 医嘱信息表对应实体类
 */
public class NurseAdv  implements java.io.Serializable {

     private String advId;
     private NursePat nursePat;
     private NurseWork nurseWork;
     private String advText;
     private Date advBigTime;
     private Date advEndTime;
     private String advStat;
     private Set nurseAdvings = new HashSet(0);

    public NurseAdv() {
    }

    public NurseAdv(NursePat nursePat, NurseWork nurseWork) {
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
    }
    
    public NurseAdv(NursePat nursePat, NurseWork nurseWork, String advText, Date advBigTime, Date advEndTime, String advStat, Set nurseAdvings) {
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
        this.advText = advText;
        this.advBigTime = advBigTime;
        this.advEndTime = advEndTime;
        this.advStat = advStat;
        this.nurseAdvings = nurseAdvings;
    }

    public String getAdvId() {
        return this.advId;
    }
    
    /**
     * @param advId 医嘱ID用下达医嘱医生的工号+下达日期（精确到毫秒）来拼字符串，拼出医嘱ID，确保每条ID都是自动生成且无重复.如医生工号是00002，下达日期是2014/01/07/10:49:5123mm,则医嘱ID系统自动生成为000022014010710495123
     */
    public void setAdvId(String advId) {
        this.advId = advId;
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

    public String getAdvText() {
        return this.advText;
    }
    
    public void setAdvText(String advText) {
        this.advText = advText;
    }

    public Date getAdvBigTime() {
        return this.advBigTime;
    }
    
    public void setAdvBigTime(Date advBigTime) {
        this.advBigTime = advBigTime;
    }

    public Date getAdvEndTime() {
        return this.advEndTime;
    }
    
    public void setAdvEndTime(Date advEndTime) {
        this.advEndTime = advEndTime;
    }

    public String getAdvStat() {
        return this.advStat;
    }
    
    public void setAdvStat(String advStat) {
        this.advStat = advStat;
    }

    public Set getNurseAdvings() {
        return this.nurseAdvings;
    }
    
    public void setNurseAdvings(Set nurseAdvings) {
        this.nurseAdvings = nurseAdvings;
    }
}