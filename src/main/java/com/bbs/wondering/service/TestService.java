package com.bbs.wondering.service;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.bbs.wondering.model.User;

public class TestService extends HibernateDaoSupport{
	public List<User> findAll(){
		final String hql = "select t from User";
/*		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query =	session.createQuery(hql);
		List list = query.list();
		transaction.commit();
		session.close();
		sessionFactory.close();
		return list;*/

/*		HibernateTemplate hibernateTemplate = getHibernateTemplate();
		//hibernateTemplate.setCacheQueries(false);
		return (List<User>)hibernateTemplate.find(hql);*/
		
		
	//	sql = 
				
		List<User> list= (List)super.getHibernateTemplate().execute(new HibernateCallback<Object>(){
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(hql);
				query.setCacheable(false);
				List list = query.list();
				session.close();
				return list;
			}
		});
		return list;
	}
}
