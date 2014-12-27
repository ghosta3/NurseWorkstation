package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;

public class HospitalDischargeDAOImpl extends
		BaseDAOImpl<String, HospitalDischarge> implements HospitalDischargeDAO {

	public HospitalDischargeDAOImpl() {
		super(HospitalDischarge.class);
	}

}
