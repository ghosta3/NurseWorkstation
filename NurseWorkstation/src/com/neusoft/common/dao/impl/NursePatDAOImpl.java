package com.neusoft.common.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NursePatDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseDrug;
import com.neusoft.common.domain.NursePat;

public class NursePatDAOImpl extends BaseDAOImpl<String, NursePat> implements NursePatDAO {

	public NursePatDAOImpl() {
		super(NursePat.class);
	}

	@Override
	public NursePat findByPatName(String patName) {
		// TODO Auto-generated method stub
		String hql = "from NursePat as p where patName = ?";
		System.out.println(patName+"ffff");
		Session session = getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, "金小胖");
		NursePat pat = (NursePat) query.list().get(0);
		return pat;
	}

}
