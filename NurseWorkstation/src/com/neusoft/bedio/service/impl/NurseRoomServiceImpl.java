package com.neusoft.bedio.service.impl;

import java.util.List;

import com.neusoft.bedio.service.ifac.NurseRoomService;
import com.neusoft.common.dao.ifac.NurseRoomDAO;
import com.neusoft.common.domain.NurseRoom;

public class NurseRoomServiceImpl implements NurseRoomService{

	private NurseRoomDAO nurseRoomDAO;

	public void setNurseRoomDAO(NurseRoomDAO nurseRoomDAO) {
		this.nurseRoomDAO = nurseRoomDAO;
	}

	@Override
	public List<NurseRoom> findAllNurseRoom() {
		return nurseRoomDAO.findAll();
	}

	@Override
	public NurseRoom findById(String id) {
		return nurseRoomDAO.findById(id);
	}
}
