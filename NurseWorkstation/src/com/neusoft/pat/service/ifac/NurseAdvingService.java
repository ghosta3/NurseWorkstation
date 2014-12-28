package com.neusoft.pat.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseAdving;

public interface NurseAdvingService {

	List<NurseAdving> findAdvingByAdvId(String advId);

}
