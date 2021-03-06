package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.ResidentApplyDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.ResidentApply;

public class ResidentApplyDAOImpl extends
		BaseDAOImpl<String, ResidentApply> implements ResidentApplyDAO {

	public ResidentApplyDAOImpl() {
		super(ResidentApply.class);
	}

}
