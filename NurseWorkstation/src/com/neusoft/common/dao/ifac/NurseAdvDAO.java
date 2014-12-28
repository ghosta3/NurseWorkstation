package com.neusoft.common.dao.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseAdv;

public interface NurseAdvDAO extends BaseDAO<String, NurseAdv> {
	
	public List<NurseAdv> findAdv(String patName,String workName);
	public void changeAdvStat(String patId);
}