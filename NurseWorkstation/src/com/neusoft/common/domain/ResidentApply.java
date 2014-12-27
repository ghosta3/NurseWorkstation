package com.neusoft.common.domain;



/**
 * 住院申请表对应实体类
 * @author Ghost
 */

public class ResidentApply  implements java.io.Serializable {

     private String patId;
     private NursePat nursePat;
     private OfficeDepartment officeDepartment;
     private String workId;
     private String resState;

    public ResidentApply() {
    }

    /**
     * @param resState 0：不允许住，1：允许住  默认为：1
     */
    public ResidentApply(NursePat nursePat,OfficeDepartment officeDepartment, String workId, String resState) {
    	this.nursePat = nursePat;
        this.officeDepartment = officeDepartment;
        this.workId = workId;
        this.resState = resState;
    }

    public String getPatId() {
        return this.patId;
    }
    
    public void setPatId(String patId) {
        this.patId = patId;
    }

    public NursePat getNursePat() {
		return nursePat;
	}

	public void setNursePat(NursePat nursePat) {
		this.nursePat = nursePat;
	}

	public OfficeDepartment getOfficeDepartment() {
        return this.officeDepartment;
    }
    
    public void setOfficeDepartment(OfficeDepartment officeDepartment) {
        this.officeDepartment = officeDepartment;
    }

    public String getWorkId() {
        return this.workId;
    }
    
    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getResState() {
        return this.resState;
    }
    
    /**
     * @param resState 0：不允许住，1：允许住  默认为：1
     */
    public void setResState(String resState) {
        this.resState = resState;
    }
}