package com.neusoft.bedio.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseRoom;

public interface NurseRoomService {

	public List<NurseRoom> findAllNurseRoom();
	
	public NurseRoom findById(String id);
	
}
