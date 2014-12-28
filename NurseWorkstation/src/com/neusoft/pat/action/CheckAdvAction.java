package com.neusoft.pat.action;

import java.util.List;

import com.neusoft.common.domain.NurseAdv;
import com.neusoft.pat.service.ifac.NurseAdvService;
import com.opensymphony.xwork2.ActionSupport;

public class CheckAdvAction extends ActionSupport {
	
	private String patName;
	private String workName;
	private List<NurseAdv> list;
	public List<NurseAdv> getList() {
		return list;
	}
	public void setList(List<NurseAdv> list) {
		this.list = list;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	
	private NurseAdvService nurseAdvService;
	
	public void setNurseAdvService(NurseAdvService nurseAdvService) {
		this.nurseAdvService = nurseAdvService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list = this.nurseAdvService.findAdv(patName, workName);
		return SUCCESS;
	}

}
