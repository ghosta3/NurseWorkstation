package com.neusoft.pat.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseDrug;

public interface NurseDrugService {
	public NurseDrug findDrugPriceByName(String drugName);
	public NurseDrug findDrugById(String drugId);

}
