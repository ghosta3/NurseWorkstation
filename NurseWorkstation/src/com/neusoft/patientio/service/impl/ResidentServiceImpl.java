package com.neusoft.patientio.service.impl;

import java.util.List;

import com.neusoft.common.dao.ifac.NurseBeginDAO;
import com.neusoft.common.dao.ifac.OfficeDepartmentDAO;
import com.neusoft.common.dao.ifac.ResidentApplyDAO;
import com.neusoft.common.domain.NurseBegin;
import com.neusoft.common.domain.OfficeDepartment;
import com.neusoft.common.domain.ResidentApply;
import com.neusoft.patientio.service.ifac.ResidentService;

public class ResidentServiceImpl implements ResidentService {
	private ResidentApplyDAO residentApplyDAO;
	private NurseBeginDAO nurseBeginDAO;
	private OfficeDepartmentDAO officeDepartmentDAO;

	public ResidentApplyDAO getResidentApplyDAO() {
		return residentApplyDAO;
	}

	public void setResidentApplyDAO(ResidentApplyDAO residentApplyDAO) {
		this.residentApplyDAO = residentApplyDAO;
	}

	public NurseBeginDAO getNurseBeginDAO() {
		return nurseBeginDAO;
	}

	public void setNurseBeginDAO(NurseBeginDAO nurseBeginDAO) {
		this.nurseBeginDAO = nurseBeginDAO;
	}

	public OfficeDepartmentDAO getOfficeDepartmentDAO() {
		return officeDepartmentDAO;
	}

	public void setOfficeDepartmentDAO(OfficeDepartmentDAO officeDepartmentDAO) {
		this.officeDepartmentDAO = officeDepartmentDAO;
	}

	@Override
	public List<ResidentApply> findAllResidentApply() {
		return residentApplyDAO.findAll();
	}

	@Override
	public ResidentApply findResidentApplyById(String patId) {
		return residentApplyDAO.findById(patId);
	}

	@Override
	public List<OfficeDepartment> findAllOfficeDepartment() {
		return officeDepartmentDAO.findAll();
	}

	@Override
	public boolean saveNurseBegin(NurseBegin nurseBegin) {
		nurseBeginDAO.save(nurseBegin);
		return true;
	}

	@Override
	public boolean updateResidentApply(ResidentApply residentApply) {
		residentApplyDAO.update(residentApply);
		return true;
	}
}
