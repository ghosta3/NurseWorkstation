package com.neusoft.common.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseAdvDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseAdv;

public class NurseAdvDAOImpl extends BaseDAOImpl<String, NurseAdv> implements NurseAdvDAO {

	public NurseAdvDAOImpl() {
		super(NurseAdv.class);
	}

	@Override
	public List<NurseAdv> findAdv(String patName, String officeName,
			String workName, String roomName) {
		// TODO Auto-generated method stub
		String hql = "from NurseAdv as na where ";
		
		if(patName.length() > 0){
			hql = hql + " na.nursePat.patName like '%" + patName + "%' and ";
		}
		if(workName.length() > 0){
			hql = hql + " na.nurseWork.workName like '" + workName + "' and ";
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
	public void changeAdvStat(String patId) {
		//通过病人id找到病人，然后找到对应的医嘱信息表
		String hql = "from NurseAdv as na where na.nursePat.patId = ?";
		Session session = getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, patId);
		
		NurseAdv adv = (NurseAdv) query.list().get(0);
		adv.setAdvStat("1");
		session.close();
		this.update(adv);
		
	}
	
}
