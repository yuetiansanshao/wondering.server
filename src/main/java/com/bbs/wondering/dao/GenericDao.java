package com.bbs.wondering.dao;

import java.io.Serializable;
import java.util.List;

/**
 *  基础DAO操作；
 * @author wondering
 * @param <T>
 * @param <PK>
 */

public interface GenericDao<T,PK extends Serializable> {

	
	List<T> findAll(Class<T> clazz);
}
