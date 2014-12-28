package com.neusoft.bedio.service.ifac;

import java.util.List;

import com.neusoft.common.domain.HospitalBedlevel;


public interface HospitalBedlevelServiceIfac {

	public List<HospitalBedlevel> findAllHospitalBedlevel();
	public HospitalBedlevel findById(Short id);
}
