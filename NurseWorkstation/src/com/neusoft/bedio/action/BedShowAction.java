package com.neusoft.bedio.action;

import java.util.List;

import com.neusoft.bedio.service.ifac.NurseBedServiceIfac;
import com.neusoft.bedio.service.ifac.OfficeDepartmentServiceIfac;
import com.neusoft.common.domain.NurseBed;
import com.neusoft.common.domain.OfficeDepartment;
import com.opensymphony.xwork2.ActionSupport;

public class BedShowAction extends ActionSupport{
	
	private OfficeDepartment officeDepartment;
	private List<NurseBed> nurseBedList;
	private List<OfficeDepartment> officeDepartmentList;
	
	private OfficeDepartmentServiceIfac officeDepartmentServiceIfac;
	private NurseBedServiceIfac nurseBedServiceIfac;
	public void setNurseBedServiceIfac(NurseBedServiceIfac nurseBedServiceIfac) {
		this.nurseBedServiceIfac = nurseBedServiceIfac;
	}
	public void setOfficeDepartmentServiceIfac(
			OfficeDepartmentServiceIfac officeDepartmentServiceIfac) {
		this.officeDepartmentServiceIfac = officeDepartmentServiceIfac;
	}
	
	public String showDepartment(){
		System.out.println("1111111111111");
		officeDepartmentList = officeDepartmentServiceIfac.findAllOfficeDepartment();
		System.out.println(officeDepartmentList.size());
		return "showdepartment";
	}
	
	public String showbed(){
		nurseBedList = nurseBedServiceIfac.findAllNurseBed();
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
	
	
	
}
