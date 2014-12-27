package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseWorkDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseWork;

public class NurseWorkDAOImpl extends
		BaseDAOImpl<String, NurseWork> implements NurseWorkDAO{

	public NurseWorkDAOImpl() {
		super(NurseWork.class);
	}

}
