package com.neusoft.common.dao.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseBed;

public interface NurseBedDAO extends BaseDAO<String, NurseBed> {

	public List<NurseBed> findByRoomId(String roomId);
}