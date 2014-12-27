package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseAdvingDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseAdving;

public class NurseAdvingDAOImpl extends BaseDAOImpl<String, NurseAdving> implements NurseAdvingDAO {

	public NurseAdvingDAOImpl() {
		super(NurseAdving.class);
	}

}
