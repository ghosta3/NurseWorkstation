package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.domain.HospitalBedlevel;

public class HospitalBedlevelDAOImpl extends
		BaseDAOImpl<Short, HospitalBedlevel> implements HospitalBedlevelDAO {

	public HospitalBedlevelDAOImpl() {
		super(HospitalBedlevel.class);
	}

}
