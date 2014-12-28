package com.neusoft.pat.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseAdv;

public interface NurseAdvService {
	public List<NurseAdv> findAdv(String patName,String workName);
	public void changeAdvStat(String patId);

}
