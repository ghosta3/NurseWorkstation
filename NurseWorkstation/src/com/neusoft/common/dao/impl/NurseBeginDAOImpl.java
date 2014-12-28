package com.neusoft.common.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseBeginDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseBegin;

public class NurseBeginDAOImpl extends
		BaseDAOImpl<Integer, NurseBegin> implements NurseBeginDAO{

	public NurseBeginDAOImpl() {
		super(NurseBegin.class);
	}

	@Override
	public List<NurseBegin> findNurseBegin(String patName, String bedId,
			String roomId) {
		// TODO Auto-generated method stub
		String hql = "from NurseBegin as nb where ";
		
		if(patName.length() > 0){
			hql = hql + " nb.nursePat.patName like '%" + patName + "%' and ";
		}
		if(bedId.length() > 0){
			hql = hql + " nb.nurseBed.bedId = '" + String.format("%-5s",bedId) + "' and ";
		}
		if(roomId.length() > 0){
			String a = roomId + "房";
			hql = hql + " nb.nurseBed.nurseRoom.roomInfo = '" + a + "' and ";
		}
		if(hql.lastIndexOf("and ")==hql.length() -4)
		      hql=hql.substring(0,hql.lastIndexOf("and ")) ;
		if(hql.lastIndexOf("where ")==hql.length() -6)
		      hql=hql.substring(0,hql.lastIndexOf("where ")) ;
		System.out.println(hql);
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		System.out.println(query.list().size());
		return query.list();
	}

	@Override
	public List<NurseBegin> findNurseBeginByPatOrWork(String patName,
			String workName) {
String hql = "from NurseBegin as nb where ";
		
		if(patName.length() > 0){
			hql = hql + " nb.nursePat.patName like '%" + patName + "%' and ";
		}
		if(workName.length() > 0){
			hql = hql + " nb.nurseWork.workName = '" + workName + "' and ";
		}
		if(hql.lastIndexOf("and ")==hql.length() -4)
		      hql=hql.substring(0,hql.lastIndexOf("and ")) ;
		if(hql.lastIndexOf("where ")==hql.length() -6)
		      hql=hql.substring(0,hql.lastIndexOf("where ")) ;
		System.out.println(hql);
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		System.out.println(query.list().size());
		return query.list();
	}

}
