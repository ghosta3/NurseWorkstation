package com.neusoft.pat.action;

import java.util.List;

import com.neusoft.common.domain.NurseDrug;
import com.neusoft.pat.service.ifac.NurseDrugService;
import com.opensymphony.xwork2.ActionSupport;

public class DrugDetailAction extends ActionSupport {
	
	private String drugId;
	private NurseDrug drug;
	public NurseDrug getDrug() {
		return drug;
	}

	public void setDrug(NurseDrug drug) {
		this.drug = drug;
	}

	public String getDrugId() {
		return drugId;
	}

	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}
	
	private NurseDrugService nurseDrugService;

	public void setNurseDrugService(NurseDrugService nurseDrugService) {
		this.nurseDrugService = nurseDrugService;
	}
	
	@Override
	public String execute() throws Exception {
		drug = this.nurseDrugService.findDrugById(drugId);
		return SUCCESS;
	}

}
