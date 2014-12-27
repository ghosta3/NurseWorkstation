package com.neusoft.common.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * 病人信息表对应实体类
 * @author Ghost
 */

public class NursePat  implements java.io.Serializable {

     private String patId;
     private String patName;
     private String patSex;
     private Byte patAge;
     private Date patBirthday;
     private String patCertificate;
     private Date parServDate;
     private ResidentApply residentApply;
     private HospitalDischarge hospitalDischarge;
     private Set nurseBegins = new HashSet(0);
     private Set nurseConsumInfos = new HashSet(0);
     private Set nurseConsums = new HashSet(0);
     private Set nurseAdvs = new HashSet(0);
     private Set nurseAdvings = new HashSet(0);

    public NursePat() {
    }

    public NursePat(String patName) {
        this.patName = patName;
    }
    
    public NursePat(String patName, String patSex, Byte patAge, Date patBirthday, String patCertificate, Date parServDate, HospitalDischarge hospitalDischarge, Set nurseBegins, Set nurseConsumInfos, Set nurseConsums, Set nurseAdvs, Set nurseAdvings) {
        this.patName = patName;
        this.patSex = patSex;
        this.patAge = patAge;
        this.patBirthday = patBirthday;
        this.patCertificate = patCertificate;
        this.parServDate = parServDate;
        this.residentApply = residentApply;
        this.hospitalDischarge = hospitalDischarge;
        this.nurseBegins = nurseBegins;
        this.nurseConsumInfos = nurseConsumInfos;
        this.nurseConsums = nurseConsums;
        this.nurseAdvs = nurseAdvs;
        this.nurseAdvings = nurseAdvings;
    }

    public String getPatId() {
        return this.patId;
    }
    
    public void setPatId(String patId) {
        this.patId = patId;
    }

    public String getPatName() {
        return this.patName;
    }
    
    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPatSex() {
        return this.patSex;
    }
    
    public void setPatSex(String patSex) {
        this.patSex = patSex;
    }

    public Byte getPatAge() {
        return this.patAge;
    }
    
    public void setPatAge(Byte patAge) {
        this.patAge = patAge;
    }

    public Date getPatBirthday() {
        return this.patBirthday;
    }
    
    public void setPatBirthday(Date patBirthday) {
        this.patBirthday = patBirthday;
    }

    public String getPatCertificate() {
        return this.patCertificate;
    }
    
    public void setPatCertificate(String patCertificate) {
        this.patCertificate = patCertificate;
    }

    public Date getParServDate() {
        return this.parServDate;
    }
    
    public void setParServDate(Date parServDate) {
        this.parServDate = parServDate;
    }

    public ResidentApply getResidentApply() {
		return residentApply;
	}

	public void setResidentApply(ResidentApply residentApply) {
		this.residentApply = residentApply;
	}

	public HospitalDischarge getHospitalDischarge() {
        return this.hospitalDischarge;
    }
    
    public void setHospitalDischarge(HospitalDischarge hospitalDischarge) {
        this.hospitalDischarge = hospitalDischarge;
    }

    public Set getNurseBegins() {
        return this.nurseBegins;
    }
    
    public void setNurseBegins(Set nurseBegins) {
        this.nurseBegins = nurseBegins;
    }

    public Set getNurseConsumInfos() {
        return this.nurseConsumInfos;
    }
    
    public void setNurseConsumInfos(Set nurseConsumInfos) {
        this.nurseConsumInfos = nurseConsumInfos;
    }

    public Set getNurseConsums() {
        return this.nurseConsums;
    }
    
    public void setNurseConsums(Set nurseConsums) {
        this.nurseConsums = nurseConsums;
    }

    public Set getNurseAdvs() {
        return this.nurseAdvs;
    }
    
    public void setNurseAdvs(Set nurseAdvs) {
        this.nurseAdvs = nurseAdvs;
    }

    public Set getNurseAdvings() {
        return this.nurseAdvings;
    }
    
    public void setNurseAdvings(Set nurseAdvings) {
        this.nurseAdvings = nurseAdvings;
    }
}