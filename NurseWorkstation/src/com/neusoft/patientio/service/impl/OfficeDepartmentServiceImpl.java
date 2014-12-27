package com.neusoft.patientio.service.impl;

import java.util.List;

import com.neusoft.common.dao.ifac.OfficeDepartmentDAO;
import com.neusoft.common.domain.OfficeDepartment;
import com.neusoft.patientio.service.ifac.OfficeDepartmentService;

public class OfficeDepartmentServiceImpl implements OfficeDepartmentService {
	private OfficeDepartmentDAO officeDepartmentDAO;

	public OfficeDepartmentDAO getOfficeDepartmentDAO() {
		return officeDepartmentDAO;
	}

	public void setOfficeDepartmentDAO(OfficeDepartmentDAO officeDepartmentDAO) {
		this.officeDepartmentDAO = officeDepartmentDAO;
	}

	@Override
	public List<OfficeDepartment> findAllOfficeDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

}
