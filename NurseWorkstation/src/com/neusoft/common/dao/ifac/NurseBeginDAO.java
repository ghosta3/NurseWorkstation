package com.neusoft.common.dao.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseBegin;

public interface NurseBeginDAO extends BaseDAO<Integer, NurseBegin> {
	
	public List <NurseBegin> findNurseBegin(String patName, String bedId, String roomId);

	public List<NurseBegin> findNurseBeginByPatOrWork(String patName, String workName);
	
	public NurseBegin findBeginByPatId(String patId);
}