package com.neusoft.common.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseDrugDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseDrug;

public class NurseDrugDAOImpl extends BaseDAOImpl<String, NurseDrug> implements
		NurseDrugDAO {

	public NurseDrugDAOImpl() {
		super(NurseDrug.class);
	}

	@Override
	public NurseDrug findDrugPriceByName(String drugName) {
		String hql = "from NurseDrug as d where drugName = ?";
		Session session = getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, drugName);
		NurseDrug drug = (NurseDrug) query.list().get(0);
		System.out.println(drug.getDrugName() +"name");
		return drug;
	}

	@Override
	public NurseDrug findByDrugName(String drugName) {
		// TODO Auto-generated method stub
		String hql = "from NurseDrug as d where drugName = ?";
		Session session = getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, "阿莫西林");
		NurseDrug drug = (NurseDrug) query.list().get(0);
		return drug;
	}

}
