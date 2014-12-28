package com.neusoft.pat.service.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseBegin;

public interface NurseBeginService {
	
	public void save(NurseBegin nurseBegin);
	public void delete(NurseBegin nurseBegin);
	public void update(NurseBegin nurseBegin);
	/**
	 * @param id 必须实现Serializable接口
	 * @return 查找到的实体
	 */
	public NurseBegin findById(String id);
	public List<NurseBegin> findAll();
	/**
	 * @param startIdx 索引起始值（从<i>零</i> 开始）
	 * @param maxNum 所取的集合的最大元素数量
	 * @return 查找到的实体集合
	 */
	public List<NurseBegin> findByLimit(int startIdx,int maxNum);
	
	public List <NurseBegin> findNurseBegin(String patName, String bedId, String roomId);

	public List<NurseBegin> findNurseBeginByPatOrWork(String patName, String workName);

}
