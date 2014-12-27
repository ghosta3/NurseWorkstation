package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseConsumDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseConsum;

public class NurseConsumDAOImpl extends BaseDAOImpl<String, NurseConsum> implements NurseConsumDAO {

	public NurseConsumDAOImpl() {
		super(NurseConsum.class);
	}

}
