package com.neusoft.pat.action;

import java.util.ArrayList;
import java.util.List;

import com.neusoft.common.domain.NurseAdv;
import com.neusoft.common.domain.NurseBegin;
import com.neusoft.common.domain.NurseDrug;
import com.neusoft.pat.service.ifac.NurseAdvService;
import com.neusoft.pat.service.ifac.NurseBeginService;
import com.neusoft.pat.service.ifac.NurseDrugService;
import com.opensymphony.xwork2.ActionSupport;

public class DecuteMoneyAction extends ActionSupport {

	private String patName;
	private String officeName;
	private String workName;
	private String roomName;
	private List<NurseAdv> listAdv;
	private List<NurseBegin> listBegin;
	private NurseDrug drug;

	public NurseDrug getDrug() {
		return drug;
	}

	public void setDrug(NurseDrug drug) {
		this.drug = drug;
	}

	public List<NurseBegin> getListBegin() {
		return listBegin;
	}

	public void setListBegin(List<NurseBegin> listBegin) {
		this.listBegin = listBegin;
	}

	public List<NurseAdv> getListAdv() {
		return listAdv;
	}

	public void setListAdv(List<NurseAdv> listAdv) {
		this.listAdv = listAdv;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	private NurseAdvService nurseAdvService;
	
	public void setNurseAdvService(NurseAdvService nurseAdvService) {
		this.nurseAdvService = nurseAdvService;
	}
	
	private NurseBeginService nurseBeginService;

	public void setNurseBeginService(NurseBeginService nurseBeginService) {
		this.nurseBeginService = nurseBeginService;
	}
	
	private NurseDrugService nurseDrugService;

	public void setNurseDrugService(NurseDrugService nurseDrugService) {
		this.nurseDrugService = nurseDrugService;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		/**
		 * 从医嘱信息表中得到药物详细
		 * 从住院登记表中得到病人住院信息--床位费
		 */
		String bedId = null;
		String roomId = null;
		//获得医嘱信息表内容
		listAdv = this.nurseAdvService.findAdv(patName, officeName, workName, roomName);
		//获得住院登记表内容
		listBegin = this.nurseBeginService.findNurseBeginByPatOrWork(patName, workName);
		//获得药物信息表内容
		String drugName = listAdv.get(0).getAdvText();
		drug = this.nurseDrugService.findDrugPriceByName(drugName);
		System.out.println(drug.getDrugPrice() + "ppppp");
//		this.nurseBeginService.findNurseBegin(patName, bedId, roomId, workName);
		return SUCCESS;
	}

}
