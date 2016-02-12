package com.bbs.wondering.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *  基础DAO操作；
 * @author wondering
 * @param <T>
 * @param <PK>
 */

public interface GenericDao<T,PK extends Serializable> {

	
	List<T> findAll(Class<T> clazz);
	
	List<T> findAllByParamters(Class<T> clazz, Map<String,Object> map);
}
