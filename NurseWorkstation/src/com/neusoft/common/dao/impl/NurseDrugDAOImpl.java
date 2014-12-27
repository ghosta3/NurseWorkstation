package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseDrugDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseDrug;

public class NurseDrugDAOImpl extends BaseDAOImpl<String, NurseDrug> implements
		NurseDrugDAO {

	public NurseDrugDAOImpl() {
		super(NurseDrug.class);
	}

}
