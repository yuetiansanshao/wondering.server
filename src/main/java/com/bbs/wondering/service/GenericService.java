package com.bbs.wondering.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericService<T,PK extends Serializable> {

	
	List<T> findAll(Class<T> clazz);
	
	List<T> findAllByParamters(Class<T> clazz,Map<String,Object> map);
}
