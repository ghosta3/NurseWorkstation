package com.neusoft.pat.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseAdv;

public interface NurseAdvService {
	public List<NurseAdv> findAdv(String patName, String officeName, String workName, String roomName);
	public void changeAdvStat(String patId);

}
