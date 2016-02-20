package com.bbs.wondering.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bbs.wondering.model.User;


@Controller
@RequestMapping("/test")
public class JSONTest {
	
	
	private static final Logger logger = Logger.getLogger(JSONTest.class);
	
	@RequestMapping("json")
	public @ResponseBody User test( ){
		logger.info("获取人员信息：");
		User user = new User();
		user.setName("我的名字");
		user.setEmail("563890@qq.com");
	//	user.setId((long)id);
		return  user;
	}
	
}
