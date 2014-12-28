package com.neusoft.bedio.service.impl;

import java.util.List;

import com.neusoft.bedio.service.ifac.NurseBedService;
import com.neusoft.common.dao.ifac.NurseBedDAO;
import com.neusoft.common.domain.NurseBed;

public class NurseBedServiceImpl implements NurseBedService{

	private NurseBedDAO nurseBedDAO;
	
	public void setNurseBedDAO(NurseBedDAO nurseBedDAO) {
		this.nurseBedDAO = nurseBedDAO;
	}
	
	@Override
	public boolean saveNurseBed(NurseBed nurseBed) {
		try {
			nurseBedDAO.save(nurseBed);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateNurseBed(NurseBed nurseBed) {
		try {
			nurseBedDAO.update(nurseBed);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteNurseBed(NurseBed nurseBed) {
		
		try {
			nurseBedDAO.delete(nurseBed);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public List<NurseBed> findAllNurseBed() {
		return nurseBedDAO.findAll();
	}
	
	@Override
	public List<NurseBed> findByRoomId(String roomId) {
		return nurseBedDAO.findByRoomId(roomId);
	}

	@Override
	public NurseBed findById(String id) {
		return nurseBedDAO.findById(id);
	}

	

}
