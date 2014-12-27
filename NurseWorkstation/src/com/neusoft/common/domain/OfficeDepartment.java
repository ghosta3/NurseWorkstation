package com.neusoft.common.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * 科室部门表对应实体类
 * @author Ghost
 */

public class OfficeDepartment  implements java.io.Serializable {

     private String officId;
     private String officName;
     private String deptName;
     private Set nurseBeds = new HashSet(0);

    public OfficeDepartment() {
    }

    public OfficeDepartment(String officName, String deptName, Set nurseBeds) {
        this.officName = officName;
        this.deptName = deptName;
        this.nurseBeds = nurseBeds;
    }

    public String getOfficId() {
        return this.officId;
    }
    
    /**
     * @param officId ID前两位代表科室编号，后两位代表所属部门。如：前两位：00外科 01内科 02儿科；后两位：00：门诊部 01：急诊部 02：住院部。 那么：0000：外科门诊部 0201：儿科急诊部  以此类推.
     */
    public void setOfficId(String officId) {
        this.officId = officId;
    }

    public String getOfficName() {
        return this.officName;
    }
    
    public void setOfficName(String officName) {
        this.officName = officName;
    }

    public String getDeptName() {
        return this.deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set getNurseBeds() {
        return this.nurseBeds;
    }
    
    public void setNurseBeds(Set nurseBeds) {
        this.nurseBeds = nurseBeds;
    }
}