package com.neusoft.pat.service.impl;

import java.util.List;

import com.neusoft.common.dao.ifac.NurseBeginDAO;
import com.neusoft.common.dao.ifac.NurseConsumInfoDAO;
import com.neusoft.common.domain.NurseBegin;
import com.neusoft.pat.service.ifac.NurseBeginService;

public class NurseBeginServiceImpl implements NurseBeginService  {
	
	private NurseBeginDAO nurseBeginDAO;
	
	public void setNurseBeginDAO(NurseBeginDAO nurseBeginDAO) {
		this.nurseBeginDAO = nurseBeginDAO;
	}

	@Override
	public void save(NurseBegin nurseBegin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(NurseBegin nurseBegin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(NurseBegin nurseBegin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NurseBegin findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NurseBegin> findAll() {
		// TODO Auto-generated method stub
		List<NurseBegin> list = nurseBeginDAO.findAll();
		return list;
	}

	@Override
	public List<NurseBegin> findByLimit(int startIdx, int maxNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NurseBegin> findNurseBegin(String patName, String bedId,
			String roomId) {
		// TODO Auto-generated method stub
		return this.nurseBeginDAO.findNurseBegin(patName, bedId, roomId);
	}

	@Override
	public List<NurseBegin> findNurseBeginByPatOrWork(String patName,
			String workName) {
		// TODO Auto-generated method stub
		return this.nurseBeginDAO.findNurseBeginByPatOrWork(patName, workName);
	}

	@Override
	public void changeLeftMoney(String patId, Double consumMoney) {
		// TODO Auto-generated method stub
		//通过patId查找到对于的住院登记表
		NurseBegin begin =  this.nurseBeginDAO.findBeginByPatId(patId);
		Double beforeMoney = begin.getDepoMoney();
		begin.setDepoMoney(beforeMoney-consumMoney);
		this.nurseBeginDAO.update(begin);
		//更改住院登记表余额
		
	}

}
