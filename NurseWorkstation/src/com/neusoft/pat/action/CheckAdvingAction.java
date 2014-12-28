package com.neusoft.pat.action;

import java.util.List;

import com.neusoft.common.domain.NurseAdving;
import com.neusoft.pat.service.ifac.NurseAdvingService;
import com.opensymphony.xwork2.ActionSupport;

public class CheckAdvingAction extends ActionSupport {
	
	private String advId;
	private List<NurseAdving> advingList;

	public List<NurseAdving> getAdvingList() {
		return advingList;
	}

	public void setAdvingList(List<NurseAdving> advingList) {
		this.advingList = advingList;
	}

	public String getAdvId() {
		return advId;
	}

	public void setAdvId(String advId) {
		this.advId = advId;
	}
	
	private NurseAdvingService nurseAdvingService;

	public void setNurseAdvingService(NurseAdvingService nurseAdvingService) {
		this.nurseAdvingService = nurseAdvingService;
	}

	@Override
	public String execute() throws Exception {
		advingList = this.nurseAdvingService.findAdvingByAdvId(advId);
		return super.execute();
	}

}
