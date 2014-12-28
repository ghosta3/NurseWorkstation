package com.neusoft.bedio.service.impl;

import java.util.List;

import com.neusoft.bedio.service.ifac.NurseBedServiceIfac;
import com.neusoft.common.dao.ifac.NurseBedDAO;
import com.neusoft.common.domain.NurseBed;

public class NurseBedServiceImpl implements NurseBedServiceIfac{

	private NurseBedDAO nurseBedDAO;
	
	public void setNurseBedDAO(NurseBedDAO nurseBedDAO) {
		this.nurseBedDAO = nurseBedDAO;
	}
	
	@Override
	public boolean saveNurseBed(NurseBed nurseBed) {
		nurseBedDAO.save(nurseBed);
		return true;
	}

	@Override
	public boolean updateNurseBed(NurseBed nurseBed) {
		nurseBedDAO.update(nurseBed);
		return true;
	}

	@Override
	public boolean deleteNurseBed(NurseBed nurseBed) {
		nurseBedDAO.delete(nurseBed);
		return true;
	}

	@Override
	public List<NurseBed> findAllNurseBed() {
		return nurseBedDAO.findAll();
	}

	@Override
	public NurseBed findById(String id) {
		return nurseBedDAO.findById(id);
	}

}
