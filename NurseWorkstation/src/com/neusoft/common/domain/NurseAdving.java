package com.neusoft.common.domain;

import java.util.Date;

public class NurseAdving  implements java.io.Serializable {

     private String advingId;
     private NursePat nursePat;
     private NurseWork nurseWork;
     private NurseAdv nurseAdv;
     private Date advingDate;
     private String advingSign;

    public NurseAdving() {
    }

    public NurseAdving(NursePat nursePat, NurseWork nurseWork, NurseAdv nurseAdv) {
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
        this.nurseAdv = nurseAdv;
    }

    /**
     * @param advingSign 医嘱的标志位（0代表已经执行的医嘱；1代表未执行的医嘱）默认1表示未执行。
     */
    public NurseAdving(NursePat nursePat, NurseWork nurseWork, NurseAdv nurseAdv, Date advingDate, String advingSign) {
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
        this.nurseAdv = nurseAdv;
        this.advingDate = advingDate;
        this.advingSign = advingSign;
    }

    public String getAdvingId() {
        return this.advingId;
    }
    
    /**
     * @param advingId 医嘱执行情况ID用病人ID+执行日期（精确到秒）来拼字符串，拼出医嘱执行情况ID，确保每条ID都是自动生成且无重复.如病人ID是00002，下达日期是2014/01/07/10:49:5123mm,则医嘱ID系统自动生成为000220140101104951
     */
    public void setAdvingId(String advingId) {
        this.advingId = advingId;
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

    public NurseAdv getNurseAdv() {
        return this.nurseAdv;
    }
    
    public void setNurseAdv(NurseAdv nurseAdv) {
        this.nurseAdv = nurseAdv;
    }

    public Date getAdvingDate() {
        return this.advingDate;
    }
    
    public void setAdvingDate(Date advingDate) {
        this.advingDate = advingDate;
    }

    public String getAdvingSign() {
        return this.advingSign;
    }
    
    public void setAdvingSign(String advingSign) {
        this.advingSign = advingSign;
    }
}