package com.bbs.wondering.service.imp;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bbs.wondering.model.User;
import com.bbs.wondering.service.TestService;

@Service("testService")
public class TestServiceImp extends GenericServiceImp<User, Long> implements TestService{
	
	public List<User> findAll(){
		List<User> list = this.findAll(User.class);
		return list;
/*		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query =	session.createQuery(hql);
		List list = query.list();
		transaction.commit();
		session.close();
		sessionFactory.close();
		return list;*/

	//	HibernateTemplate hibernateTemplate = getHibernateTemplate();
		//hibernateTemplate.setCacheQueries(false);
	//	return (List<User>)hibernateTemplate.find(hql);
		
		
	//	sql = 
				
/*		List<User> list= (List)super.getHibernateTemplate().execute(new HibernateCallback<Object>(){
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
		return list;*/
	}
}
