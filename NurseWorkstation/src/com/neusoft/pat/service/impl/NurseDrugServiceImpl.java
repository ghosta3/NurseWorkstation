package com.neusoft.pat.service.impl;

import java.util.List;

import com.neusoft.common.dao.ifac.NurseDrugDAO;
import com.neusoft.common.domain.NurseDrug;
import com.neusoft.pat.service.ifac.NurseDrugService;

public class NurseDrugServiceImpl implements NurseDrugService {
	
	private NurseDrugDAO nurseDrugDAO;

	public void setNurseDrugDAO(NurseDrugDAO nurseDrugDAO) {
		this.nurseDrugDAO = nurseDrugDAO;
	}

	@Override
	public NurseDrug findDrugPriceByName(String drugName) {
		// TODO Auto-generated method stub
		return this.nurseDrugDAO.findDrugPriceByName(drugName);
		
	}

	@Override
	public NurseDrug findDrugById(String drugId) {
		// TODO Auto-generated method stub
		return this.nurseDrugDAO.findById(drugId);
	}
	
	

}
