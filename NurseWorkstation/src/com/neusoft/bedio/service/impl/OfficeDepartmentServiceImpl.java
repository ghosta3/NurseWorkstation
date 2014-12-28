package com.neusoft.bedio.service.impl;

import java.util.List;
import com.neusoft.bedio.service.ifac.OfficeDepartmentServiceIfac;
import com.neusoft.common.dao.ifac.OfficeDepartmentDAO;
import com.neusoft.common.domain.OfficeDepartment;

public class OfficeDepartmentServiceImpl implements OfficeDepartmentServiceIfac{

	private OfficeDepartmentDAO officeDepartmentDAO;
	
	public void setOfficeDepartmentDAO(OfficeDepartmentDAO officeDepartmentDAO) {
		this.officeDepartmentDAO = officeDepartmentDAO;
	}

	@Override
	public boolean saveOfficeDepartment(OfficeDepartment officeDepartment) {
		officeDepartmentDAO.save(officeDepartment);
		return true;			
	}

	@Override
	public boolean updateOfficeDepartment(OfficeDepartment officeDepartment) {
		officeDepartmentDAO.update(officeDepartment);
		return true;
	}

	@Override
	public boolean deleteOfficeDepartment(OfficeDepartment officeDepartment) {
		officeDepartmentDAO.delete(officeDepartment);
		return true;
	}

	@Override
	public List<OfficeDepartment> findAllOfficeDepartment() {
		return officeDepartmentDAO.findAll();
	}

	@Override
	public OfficeDepartment findById(String id) {
		return officeDepartmentDAO.findById(id);
	}

}
