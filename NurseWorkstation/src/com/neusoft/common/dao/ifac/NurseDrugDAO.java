package com.neusoft.common.dao.ifac;

import com.neusoft.common.domain.NurseDrug;

public interface NurseDrugDAO extends BaseDAO<String, NurseDrug> {
	
	public NurseDrug findDrugPriceByName(String drugName);
	public NurseDrug findByDrugName(String drugName);

}