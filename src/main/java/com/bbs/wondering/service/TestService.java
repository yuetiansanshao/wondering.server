package com.bbs.wondering.service;

import java.util.List;



import com.bbs.wondering.model.User;
public interface TestService extends GenericService<User, Long> {
	
	public List<User> findAll();
		
}
