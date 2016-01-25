package com.bbs.wondering.service;

import org.hibernate.Query;
import org.hibernate.Session;

public class TestService {
	
	public String test(){
		String hql = "select * from User";
	//Query query = session.createQuery(hql);
		return hql;
	}
}
