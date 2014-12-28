package com.neusoft.common.dao.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseConsumInfo;
import com.neusoft.common.domain.NursePat;

public interface NurseConsumInfoDAO extends BaseDAO<String, NurseConsumInfo> {
	
	public List<NurseConsumInfo> findComsumInfoByPat(NursePat pat);

	public List<NurseConsumInfo> findComsumInfoByPatId(String patId);

}