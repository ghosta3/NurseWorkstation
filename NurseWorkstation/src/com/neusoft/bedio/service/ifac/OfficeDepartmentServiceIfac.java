package com.neusoft.bedio.service.ifac;

import java.util.List;

import com.neusoft.common.domain.OfficeDepartment;

public interface OfficeDepartmentServiceIfac {

	public boolean saveOfficeDepartment(OfficeDepartment officeDepartment);

	public boolean updateOfficeDepartment(OfficeDepartment officeDepartment);

	public boolean deleteOfficeDepartment(OfficeDepartment officeDepartment);
	
	public List<OfficeDepartment> findAllOfficeDepartment();
	
	public OfficeDepartment findById(String id);
}
