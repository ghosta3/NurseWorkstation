package com.neusoft.patientio.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseBegin;
import com.neusoft.common.domain.OfficeDepartment;
import com.neusoft.common.domain.ResidentApply;

public interface ResidentService {
	public List<ResidentApply> findAllResidentApply();

	public ResidentApply findResidentApplyById(String patId);
	
	public List<OfficeDepartment> findAllOfficeDepartment();
	
	public boolean saveNurseBegin(NurseBegin nurseBegin);

	public boolean updateResidentApply(ResidentApply residentApply);

}