package com.neusoft.common.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseConsumInfoDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseConsumInfo;
import com.neusoft.common.domain.NursePat;

public class NurseConsumInfoDAOImpl extends
		BaseDAOImpl<String, NurseConsumInfo> implements NurseConsumInfoDAO {

	public NurseConsumInfoDAOImpl() {
		super(HospitalDischarge.class);
	}

	@Override
	public List<NurseConsumInfo> findComsumInfoByPat(NursePat pat) {
		// TODO Auto-generated method stub
		System.out.println(pat.getPatName()+"eee");
		String hql = "from NurseConsumInfo nurseConsumInfo where nurseConsumInfo.nursePat = '" + pat + "'";
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public List<NurseConsumInfo> findComsumInfoByPatId(String patId) {
		// TODO Auto-generated method stub
		String hql = "from NurseConsumInfo nurseConsumInfo where nurseConsumInfo.nursePat.patId = '" + String.format("%-5s",patId) + "'";
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		return query.list();
	}
	
	

}
