package com.neusoft.pat.action;

import java.util.List;

import com.neusoft.common.domain.NurseConsumInfo;
import com.neusoft.pat.service.ifac.NurseConsumInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class CheckMoneyDetail extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String patId;

	public String getPatId() {
		return patId;
	}

	public void setPatId(String patId) {
		this.patId = patId;
	}
	
	private List<NurseConsumInfo> detail;
	
	public List<NurseConsumInfo> getDetail() {
		return detail;
	}

	public void setDetail(List<NurseConsumInfo> detail) {
		this.detail = detail;
	}

	private NurseConsumInfoService nurseConsumInfoService;

	public void setNurseConsumInfoService(
			NurseConsumInfoService nurseConsumInfoService) {
		this.nurseConsumInfoService = nurseConsumInfoService;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		detail = this.nurseConsumInfoService.findComsumInfoByPatId(patId);
		return "success";
	}

}
