package com.neusoft.bedio.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseBed;

public interface NurseBedService {

	public boolean saveNurseBed(NurseBed nurseBed);

	public boolean updateNurseBed(NurseBed nurseBed);

	public boolean deleteNurseBed(NurseBed nurseBed);
	
	public List<NurseBed> findAllNurseBed();
	
	public List<NurseBed> findByRoomId(String id);
	
	public NurseBed findById(String id);
}
