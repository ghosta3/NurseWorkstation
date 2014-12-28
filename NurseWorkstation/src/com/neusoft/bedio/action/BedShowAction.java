package com.neusoft.bedio.action;

import java.util.List;

import com.neusoft.bedio.service.ifac.NurseBedService;
import com.neusoft.bedio.service.ifac.OfficeDepartmentService;
import com.neusoft.common.domain.NurseBed;
import com.neusoft.common.domain.NurseBegin;
import com.neusoft.common.domain.OfficeDepartment;
import com.neusoft.pat.service.ifac.NurseBeginService;
import com.opensymphony.xwork2.ActionSupport;

public class BedShowAction extends ActionSupport{
	
	private OfficeDepartment officeDepartment;
	private List<NurseBed> nurseBedList;
	private List<OfficeDepartment> officeDepartmentList;
	private List<NurseBegin> nurseBeginList;
	private String roomId;
	
	private OfficeDepartmentService officeDepartmentService;
	private NurseBedService nurseBedService;
	private NurseBeginService nurseBeginService;
	
	public void setNurseBedService(NurseBedService nurseBedService) {
		this.nurseBedService = nurseBedService;
	}
	public void setOfficeDepartmentService(
			OfficeDepartmentService officeDepartmentService) {
		this.officeDepartmentService = officeDepartmentService;
	}
	public void setNurseBeginService(NurseBeginService nurseBeginService) {
		this.nurseBeginService = nurseBeginService;
	}
	
	public String showDepartment(){
		officeDepartmentList = officeDepartmentService.findAllOfficeDepartment();
		//System.out.println(officeDepartmentList.get(0).getNurseRooms().size());
		return "showdepartment";
	}
	
	public String showbed(){
		nurseBedList = nurseBedService.findByRoomId(roomId);
		nurseBeginList = nurseBeginService.findAll();
		System.out.println(nurseBeginList.size());
		return "showbed";
	}
	
	public OfficeDepartment getOfficeDepartment() {
		return officeDepartment;
	}
	public void setOfficeDepartment(OfficeDepartment officeDepartment) {
		this.officeDepartment = officeDepartment;
	}
	public List<NurseBed> getNurseBedList() {
		return nurseBedList;
	}
	public void setNurseBedList(List<NurseBed> nurseBedList) {
		this.nurseBedList = nurseBedList;
	}
	public List<OfficeDepartment> getOfficeDepartmentList() {
		return officeDepartmentList;
	}
	public void setOfficeDepartmentList(List<OfficeDepartment> officeDepartmentList) {
		this.officeDepartmentList = officeDepartmentList;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public List<NurseBegin> getNurseBeginList() {
		return nurseBeginList;
	}
	public void setNurseBeginList(List<NurseBegin> nurseBeginList) {
		this.nurseBeginList = nurseBeginList;
	}
	
	
	
}
