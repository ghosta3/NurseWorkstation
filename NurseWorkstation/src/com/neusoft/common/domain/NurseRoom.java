package com.neusoft.common.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * 房间信息表对应实体类
 * @author Ghost
 */

public class NurseRoom  implements java.io.Serializable {

     private String roomId;
     private String roomInfo;
     private OfficeDepartment officeDepartment;
     private Set nurseBeds = new HashSet(0);

    public NurseRoom() {
    }

    public NurseRoom(String roomInfo, OfficeDepartment officeDepartment, Set nurseBeds) {
        this.roomInfo = roomInfo;
        this.officeDepartment = officeDepartment;
        this.nurseBeds = nurseBeds;
    }

    public String getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomInfo() {
        return this.roomInfo;
    }
    
    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public Set getNurseBeds() {
        return this.nurseBeds;
    }
    
    public void setNurseBeds(Set nurseBeds) {
        this.nurseBeds = nurseBeds;
    }

	public OfficeDepartment getOfficeDepartment() {
		return officeDepartment;
	}

	public void setOfficeDepartment(OfficeDepartment officeDepartment) {
		this.officeDepartment = officeDepartment;
	}
    
    
}