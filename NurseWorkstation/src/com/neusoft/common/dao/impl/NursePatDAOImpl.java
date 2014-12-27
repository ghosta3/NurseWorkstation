package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NursePatDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NursePat;

public class NursePatDAOImpl extends BaseDAOImpl<String, NursePat> implements NursePatDAO {

	public NursePatDAOImpl() {
		super(NursePat.class);
	}

}
