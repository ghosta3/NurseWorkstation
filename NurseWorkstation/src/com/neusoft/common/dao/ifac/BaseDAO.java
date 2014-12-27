package com.neusoft.common.dao.ifac;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 * @author Ghost
 *
 * @param <T> ID的类型
 * @param <E> 实体类的类型
 */
public interface BaseDAO<T,E> {
	public void save(E instance);
	public void delete(E instance);
	public void update(E instance);
	/**
	 * @param id 必须实现Serializable接口
	 * @return 查找到的实体
	 */
	public E findById(T id);
	public List<E> findAll();
	/**
	 * @param startIdx 索引起始值（从<i>零</i> 开始）
	 * @param maxNum 所取的集合的最大元素数量
	 * @return 查找到的实体集合
	 */
	public List<E> findByLimit(int startIdx,int maxNum);
	
	public List<E> findWithConditionByLimit(int startIdx,int maxNum, Criterion[] criterions);
}
