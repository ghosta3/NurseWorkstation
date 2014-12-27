package com.neusoft.common.dao.impl;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.HospitalBedlevelDAO;
import com.neusoft.common.dao.ifac.HospitalDischargeDAO;
import com.neusoft.common.dao.ifac.NurseRoomDAO;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseRoom;

public class NurseRoomDAOImpl extends
		BaseDAOImpl<String, NurseRoom> implements NurseRoomDAO{

	public NurseRoomDAOImpl() {
		super(NurseRoom.class);
	}

}
