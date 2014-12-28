package com.neusoft.common.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseBedDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseBed;

public class NurseBedDAOImpl extends
		BaseDAOImpl<String, NurseBed> implements NurseBedDAO{

	public NurseBedDAOImpl() {
		super(NurseBed.class);
	}

	@Override
	public List<NurseBed> findByRoomId(String roomId) {
		String hql = "from NurseBed n where n.nurseRoom.roomId = '" + roomId + "'";
//		Session session = getHibernateTemplate().find(hql);
//		Query query = session.createQuery(hql);
		return getHibernateTemplate().find(hql);
	}

}
