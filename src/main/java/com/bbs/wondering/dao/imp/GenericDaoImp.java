package com.bbs.wondering.dao.imp;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.bbs.wondering.dao.GenericDao;
@Repository(value="genericDao")
public class GenericDaoImp<T, PK extends Serializable> extends HibernateDaoSupport implements GenericDao<T, PK> {

	protected static final Logger logger = LoggerFactory.getLogger(GenericDaoImp.class);
	
	
	@Autowired
	public void setBaseDaoSessionFactory(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}//'sessionFactory' or 'hibernateTemplate' is required为了注入sessionFactory
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(final Class<T> clazz) {
		// TODO Auto-generated method stub
		return (List<T>)getHibernateTemplate().execute(new HibernateCallback<T>() {

			@Override
			public T doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql ="from "+clazz.getName()+" t";
				Query query =session.createQuery(hql);
				return (T) query.list();
			}
		});
	}

}
