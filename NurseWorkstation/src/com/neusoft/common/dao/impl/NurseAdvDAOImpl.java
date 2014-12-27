package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseAdvDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseAdv;

public class NurseAdvDAOImpl extends BaseDAOImpl<String, NurseAdv> implements NurseAdvDAO {

	public NurseAdvDAOImpl() {
		super(NurseAdv.class);
	}

}
