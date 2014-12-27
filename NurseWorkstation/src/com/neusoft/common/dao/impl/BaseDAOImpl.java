package com.neusoft.common.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.common.dao.ifac.BaseDAO;

/**
 * BaseDAO的实现类
 * @author Ghost
 *
 * @param <T> ID的类型
 * @param <E> 实体类的类型
 */
public class BaseDAOImpl<T,E> extends HibernateDaoSupport implements BaseDAO<T, E> {
	private Class entityClass;
	
	/**
	 * @param entityClass 实体类的class
	 */
	public BaseDAOImpl(Class entityClass){
		this.entityClass = entityClass;
	}

	@Override
	public void save(E instance) {
		getHibernateTemplate().save(instance);
	}

	@Override
	public void delete(E instance) {
		getHibernateTemplate().delete(instance);		
	}

	@Override
	public void update(E instance) {
		getHibernateTemplate().update(instance);
	}

	/* (non-Javadoc)
	 * @see com.neusoft.patientio.dao.ifac.BaseDAO#findById(java.lang.Object)
	 */
	@Override
	public E findById(T id) {
		Object objEntity = getHibernateTemplate().get(entityClass, (Serializable) id);
		return (E) objEntity;
	}

	@Override
	public List<E> findAll() {
		String queryString = "from " + entityClass.getName();
	 	return getHibernateTemplate().find(queryString);
	}

	/* (non-Javadoc)
	 * @see com.neusoft.patientio.dao.ifac.BaseDAO#findByLimit(int, int)
	 */
	@Override
	public List<E> findByLimit(int startIdx, int maxNum) {
		String queryString = "from " + entityClass.getName();
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(queryString);
		query.setFirstResult(startIdx);
		query.setMaxResults(maxNum);
		
	 	return query.list();
	}

	@Override
	public List<E> findWithConditionByLimit(int startIdx, int maxNum,
			Criterion[] criterions ) {
		DetachedCriteria queryCriteria = DetachedCriteria.forClass(entityClass);
		for(Criterion c : criterions)
			queryCriteria.add(c);		
		return getHibernateTemplate().findByCriteria(queryCriteria, startIdx, maxNum);
	}

}
