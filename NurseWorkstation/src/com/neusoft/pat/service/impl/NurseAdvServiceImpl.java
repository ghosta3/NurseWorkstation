package com.neusoft.pat.service.impl;

import java.util.List;

import com.neusoft.common.dao.ifac.NurseAdvDAO;
import com.neusoft.common.domain.NurseAdv;
import com.neusoft.pat.service.ifac.NurseAdvService;

public class NurseAdvServiceImpl implements NurseAdvService {
	
	private NurseAdvDAO nurseAdvDAO;

	public void setNurseAdvDAO(NurseAdvDAO nurseAdvDAO) {
		this.nurseAdvDAO = nurseAdvDAO;
	}

	@Override
	public List<NurseAdv> findAdv(String patName, String officeName,
			String workName, String roomName) {
		// TODO Auto-generated method stub
		return this.nurseAdvDAO.findAdv(patName, officeName, workName, roomName);
	}

	@Override
	public void changeAdvStat(String patId) {
		// TODO Auto-generated method stub
		this.nurseAdvDAO.changeAdvStat(patId);
	}

}
