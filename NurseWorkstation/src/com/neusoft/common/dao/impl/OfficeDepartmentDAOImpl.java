package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.OfficeDepartmentDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.OfficeDepartment;

public class OfficeDepartmentDAOImpl extends
		BaseDAOImpl<String, OfficeDepartment> implements OfficeDepartmentDAO {

	public OfficeDepartmentDAOImpl() {
		super(OfficeDepartment.class);
	}

}
