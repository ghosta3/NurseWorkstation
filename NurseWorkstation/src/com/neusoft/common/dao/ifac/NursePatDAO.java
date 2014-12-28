package com.neusoft.common.dao.ifac;

import com.neusoft.common.domain.NursePat;

public interface NursePatDAO extends BaseDAO<String, NursePat> {
	
	public NursePat findByPatName(String patName);

}