package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseBedDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseBed;

public class NurseBedDAOImpl extends
		BaseDAOImpl<String, NurseBed> implements NurseBedDAO{

	public NurseBedDAOImpl() {
		super(NurseBed.class);
	}

}
