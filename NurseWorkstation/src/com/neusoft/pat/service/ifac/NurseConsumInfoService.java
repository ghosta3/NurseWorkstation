package com.neusoft.pat.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseConsumInfo;

public interface NurseConsumInfoService {
	public void save(NurseConsumInfo nurseConsumInfo);
	public void delete(NurseConsumInfo nurseConsumInfo);
	public void update(NurseConsumInfo nurseConsumInfo);
	/**
	 * @param id 必须实现Serializable接口
	 * @return 查找到的实体
	 */
	public NurseConsumInfo findById(String id);
	public List<NurseConsumInfo> findAll();
	/**
	 * @param startIdx 索引起始值（从<i>零</i> 开始）
	 * @param maxNum 所取的集合的最大元素数量
	 * @return 查找到的实体集合
	 */
	public List<NurseConsumInfo> findByLimit(int startIdx,int maxNum);
	
	public List<NurseConsumInfo> findComsumInfoByPatId(String patId);
	
	public void saveConsumInfo(String patName, String drugName,Double consumMoney);
}
