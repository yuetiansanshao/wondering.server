package com.bbs.wondering.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T,PK extends Serializable> {

	
	List<T> findAll(Class<T> clazz);
}
