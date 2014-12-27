package com.neusoft.common.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * 医务人员信息表对应实体类
 * @author Ghost
 */

public class NurseWork  implements java.io.Serializable {

     private String workId;
     private String workPsw;
     private String workName;
     private String workJob;

    public NurseWork() {
    }

    public NurseWork(String workPsw, String workName) {
        this.workPsw = workPsw;
        this.workName = workName;
    }

    public NurseWork(String workPsw, String workName, String workJob) {
        this.workPsw = workPsw;
        this.workName = workName;
        this.workJob = workJob;
    }

    public String getWorkId() {
        return this.workId;
    }
    
    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getWorkPsw() {
        return this.workPsw;
    }
    
    public void setWorkPsw(String workPsw) {
        this.workPsw = workPsw;
    }

    public String getWorkName() {
        return this.workName;
    }
    
    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkJob() {
        return this.workJob;
    }
    
    public void setWorkJob(String workJob) {
        this.workJob = workJob;
    }
}