package com.bbs.wondering.service.imp;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbs.wondering.dao.GenericDao;
import com.bbs.wondering.service.GenericService;


public class GenericServiceImp<T, PK extends Serializable> implements GenericService<T, PK> {
	protected static final Logger logger = LoggerFactory.getLogger(GenericServiceImp.class);
	
	@Resource
	private GenericDao<T, PK> genericDao;

	@Override
	public List<T> findAll(Class<T> clazz) {

		return genericDao.findAll(clazz);
	}
	


}
