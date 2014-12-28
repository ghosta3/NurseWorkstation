package com.neusoft.pat.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.neusoft.common.dao.ifac.NurseConsumInfoDAO;
import com.neusoft.common.dao.ifac.NurseDrugDAO;
import com.neusoft.common.dao.ifac.NursePatDAO;
import com.neusoft.common.domain.NurseConsumInfo;
import com.neusoft.common.domain.NurseDrug;
import com.neusoft.common.domain.NursePat;
import com.neusoft.pat.service.ifac.NurseConsumInfoService;

public class NurseConsumInfoServiceImpl implements NurseConsumInfoService{
	
	
	private NurseConsumInfoDAO nurseConsumInfoDAO;

	public void setNurseConsumInfoDAO(NurseConsumInfoDAO nurseConsumInfoDAO) {
		this.nurseConsumInfoDAO = nurseConsumInfoDAO;
	}
	
	private NursePatDAO nursePatDAO;
	
	public void setNursePatDAO(NursePatDAO nursePatDAO) {
		this.nursePatDAO = nursePatDAO;
	}
	
	private NurseDrugDAO nurseDrugDAO;

	public void setNurseDrugDAO(NurseDrugDAO nurseDrugDAO) {
		this.nurseDrugDAO = nurseDrugDAO;
	}

	@Override
	public void save(NurseConsumInfo nurseConsumInfo) {
		// TODO Auto-generated method stub
		this.nurseConsumInfoDAO.save(nurseConsumInfo);
	}

	@Override
	public void delete(NurseConsumInfo nurseConsumInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(NurseConsumInfo nurseConsumInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NurseConsumInfo findById(String id) {
		// TODO Auto-generated method stub
		System.out.println("aaa");
		System.out.println(id+" ccc");
		NurseConsumInfo n =  nurseConsumInfoDAO.findById(id);
		System.out.println(n.getDrugNum()+"bbb");
		return n;
	}

	@Override
	public List<NurseConsumInfo> findAll() {
		// TODO Auto-generated method stub
		List <NurseConsumInfo> list = nurseConsumInfoDAO.findAll();
		System.out.println(list.size());
		return list;
	}

	@Override
	public List<NurseConsumInfo> findByLimit(int startIdx, int maxNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NurseConsumInfo> findComsumInfoByPatId(String patId) {
		// TODO Auto-generated method stub
		System.out.println(patId+"---");
		NursePat pat = nursePatDAO.findById(String.format("%-5s",patId));
		if(pat==null){
			System.out.println("cccc");
		}else{
			System.out.println("qqqq");
		}
		List<NurseConsumInfo> list = nurseConsumInfoDAO.findComsumInfoByPat(pat);
		List<NurseConsumInfo> list2 = nurseConsumInfoDAO.findComsumInfoByPatId(patId);
		System.out.println(list2.size()+"wwww");
		return list2;
	}

	@Override
	public void saveConsumInfo(String patId, String drugName,
			Double consumMoney) {
		Short a = 1;
		//通过patId查找pat
		NursePat nursePat = nursePatDAO.findById(patId);
		//通过drugId查找drug
		NurseDrug nurseDrug = nurseDrugDAO.findByDrugName(drugName);
		NurseConsumInfo nurseConsumInfo1 = new NurseConsumInfo();
		nurseConsumInfo1.setNursePat(nursePat);
		nurseConsumInfo1.setOtherCost(0.0);
		nurseConsumInfo1.setNurseDrug(nurseDrug);
		nurseConsumInfo1.setDrugNum(a);
		nurseConsumInfo1.setConstTime(new Date());
		nurseConsumInfo1.setConsumInfoId(nursePat.getPatId()+(new SimpleDateFormat("yyyy-MM-dd")).format(new Date()));
		nurseConsumInfoDAO.save(nurseConsumInfo1);
		
	}
	
}
