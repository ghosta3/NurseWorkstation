package com.neusoft.common.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseAdvingDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseAdving;

public class NurseAdvingDAOImpl extends BaseDAOImpl<String, NurseAdving> implements NurseAdvingDAO {

	public NurseAdvingDAOImpl() {
		super(NurseAdving.class);
	}

	@Override
	public List<NurseAdving> findAdvingByAdvId(String advId) {
		String hql = "from NurseAdving na where na.nurseAdv.advId = '" + advId + "'";
//		Session session = getSession();
//		Query query = session.createQuery(hql);
//		return query.list();
		return getHibernateTemplate().find(hql);
	}

}
