package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseConsumInfoDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseConsumInfo;

public class NurseConsumInfoDAOImpl extends
		BaseDAOImpl<String, NurseConsumInfo> implements NurseConsumInfoDAO {

	public NurseConsumInfoDAOImpl() {
		super(HospitalDischarge.class);
	}

}
