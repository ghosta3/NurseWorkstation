package com.neusoft.pat.action;

import java.util.Date;

import com.neusoft.common.domain.NurseConsumInfo;
import com.neusoft.common.domain.NurseDrug;
import com.neusoft.common.domain.NursePat;
import com.neusoft.pat.service.ifac.NurseAdvService;
import com.neusoft.pat.service.ifac.NurseBeginService;
import com.neusoft.pat.service.ifac.NurseConsumInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class DCAction extends ActionSupport {
	
	private NurseDrug nurseDrug;
    private NursePat nursePat;
    private Double consumMoney;
    private NurseConsumInfo nurseConsumInfo;
    private String patName;
    private String drugName;
    private String patId;
    private String drugId;
	public String getDrugId() {
		return drugId;
	}
	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}
	public String getPatId() {
		return patId;
	}
	public void setPatId(String patId) {
		this.patId = patId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public NurseConsumInfo getNurseConsumInfo() {
		return nurseConsumInfo;
	}
	public void setNurseConsumInfo(NurseConsumInfo nurseConsumInfo) {
		this.nurseConsumInfo = nurseConsumInfo;
	}
	public Double getConsumMoney() {
		return consumMoney;
	}
	public void setConsumMoney(Double consumMoney) {
		this.consumMoney = consumMoney;
	}
	public NurseDrug getNurseDrug() {
		return nurseDrug;
	}
	public void setNurseDrug(NurseDrug nurseDrug) {
		this.nurseDrug = nurseDrug;
	}
	public NursePat getNursePat() {
		return nursePat;
	}
	public void setNursePat(NursePat nursePat) {
		this.nursePat = nursePat;
	}
	
	//向消费明细表插入数据
	private NurseConsumInfoService nurseConsumInfoService;
	
    public void setNurseConsumInfoService(
			NurseConsumInfoService nurseConsumInfoService) {
		this.nurseConsumInfoService = nurseConsumInfoService;
	}
    //医嘱信息表中医嘱状态更改为已划价
    private NurseAdvService nurseAdvService;
	
	public void setNurseAdvService(NurseAdvService nurseAdvService) {
		this.nurseAdvService = nurseAdvService;
	}
	@Override
    public String execute() throws Exception {
    	// TODO Auto-generated method stub
		
		System.out.println(patName+"0321");
		//消费明细表中插入一条数据
		this.nurseConsumInfoService.saveConsumInfo(patId, drugId,consumMoney);
		//医嘱信息表中执行状态更改为已执行
		this.nurseAdvService.changeAdvStat(patId);
		//住院登记表中余额扣费
//		this.nurseBeginService.changeLeftMoney(patId,consumMoney);
    	return "success";
    }

}
