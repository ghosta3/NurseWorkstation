package com.neusoft.pat.action;

import java.util.List;
import java.util.Map;

import com.neusoft.common.domain.NurseBegin;
import com.neusoft.common.domain.NurseConsumInfo;
import com.neusoft.pat.service.ifac.NurseBeginService;
import com.neusoft.pat.service.ifac.NurseConsumInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckMoney extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private NurseConsumInfoService nurseConsumInfoService;
	private NurseBeginService nurseBeginService;

	public void setNurseBeginService(NurseBeginService nurseBeginService) {
		this.nurseBeginService = nurseBeginService;
	}

	public void setNurseConsumInfoService(
			NurseConsumInfoService nurseConsumInfoService) {
		this.nurseConsumInfoService = nurseConsumInfoService;
	}

	
	private String patName;
	private String bedId;
	private String roomId;

	public String getBedId() {
		return bedId;
	}

	public void setBedId(String bedId) {
		this.bedId = bedId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}


	private List<NurseBegin> list;
	public List<NurseBegin> getList() {
		return list;
	}

	public void setList(List<NurseBegin> list) {
		this.list = list;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 从住院登记表中查到病人信息
		 */
		list = this.nurseBeginService.findNurseBegin(patName, bedId, roomId);
		
		return SUCCESS;
	}
	

}
