package com.neusoft.bedio.service.impl;

import java.util.List;

import com.neusoft.bedio.service.ifac.HospitalBedlevelService;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.domain.HospitalBedlevel;

public class HospitalBedlevelServiceImpl implements HospitalBedlevelService{

	private HospitalBedlevelDAO hospitalBedlevelDAO;
	
	
	public void setHospitalBedlevelDAO(HospitalBedlevelDAO hospitalBedlevelDAO) {
		this.hospitalBedlevelDAO = hospitalBedlevelDAO;
	}

	@Override
	public List<HospitalBedlevel> findAllHospitalBedlevel() {

		return hospitalBedlevelDAO.findAll();
	}

	@Override
	public HospitalBedlevel findById(Short id) {
		return hospitalBedlevelDAO.findById(id);
	}

}
