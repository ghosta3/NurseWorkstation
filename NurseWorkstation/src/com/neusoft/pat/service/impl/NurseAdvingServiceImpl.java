package com.neusoft.pat.service.impl;

import java.util.List;

import com.neusoft.common.dao.ifac.NurseAdvingDAO;
import com.neusoft.common.domain.NurseAdving;
import com.neusoft.pat.service.ifac.NurseAdvingService;

public class NurseAdvingServiceImpl implements NurseAdvingService {
	
	private NurseAdvingDAO nurseAdvingDAO;
	
	public void setNurseAdvingDAO(NurseAdvingDAO nurseAdvingDAO) {
		this.nurseAdvingDAO = nurseAdvingDAO;
	}



	@Override
	public List<NurseAdving> findAdvingByAdvId(String advId) {
		
		return this.nurseAdvingDAO.findAdvingByAdvId(advId);
	}

}
