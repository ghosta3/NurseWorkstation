package com.neusoft.patientio.action;

import java.util.List;

import net.sf.json.JSON;

import com.neusoft.common.domain.NurseBegin;
import com.neusoft.common.domain.ResidentApply;
import com.neusoft.patientio.service.ifac.ResidentService;
import com.neusoft.patientio.utils.AjaxUtil;
import com.opensymphony.xwork2.ActionSupport;

public class ResidentAction extends ActionSupport {
	private ResidentService residentService;
	private List<ResidentApply> residentApplyList;
	
	private NurseBegin nurseBegin;
	private ResidentApply residentApply;
	
	private JSON message;

	public JSON getMessage() {
		return message;
	}

	public void setMessage(JSON message) {
		this.message = message;
	}

	public ResidentService getResidentService() {
		return residentService;
	}

	public void setResidentService(ResidentService residentService) {
		this.residentService = residentService;
	}

	public List<ResidentApply> getResidentApplyList() {
		return residentApplyList;
	}

	public void setResidentApplyList(List<ResidentApply> residentApplyList) {
		this.residentApplyList = residentApplyList;
	}
	
	public NurseBegin getNurseBegin() {
		return nurseBegin;
	}

	public void setNurseBegin(NurseBegin nurseBegin) {
		this.nurseBegin = nurseBegin;
	}

	public ResidentApply getResidentApply() {
		return residentApply;
	}

	public void setResidentApply(ResidentApply residentApply) {
		this.residentApply = residentApply;
	}

	public String residentApplyList(){
		residentApplyList = residentService.findAllResidentApply();
		return "applyList";
	}
	
	public String residentBegin(){
		if(nurseBegin == null){
			residentApply = residentService.findResidentApplyById(residentApply.getPatId());
			return "residentBeginPage";
		}
		
		residentApply = residentService.findResidentApplyById(nurseBegin.getNursePat().getPatId());
		residentApply.setResState("1");
		nurseBegin.setNursePat(residentApply.getNursePat());
		residentService.saveNurseBegin(nurseBegin);
		residentService.updateResidentApply(residentApply);
		message = AjaxUtil.getSuccessJSON(AjaxUtil.closeCurrent, "residentApplyList");
		
		return "jsonSuccess";
	}
}
