package com.bbs.wondering.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbs.wondering.model.User;
import com.bbs.wondering.service.TestService;

@Controller
@RequestMapping("/main")
public class Login {
	@Resource
	private TestService testService;
	
	@RequestMapping("/login.html")
	public String login(HttpServletRequest re, HttpServletResponse response,HttpSession session){
		String username=re.getParameter("username");
		String passwd = re.getParameter("password");
		System.out.println("name :"+username+"password is +"+passwd);
		Map<String,Object> map = new HashMap();
		map.put("name", username);
		map.put("password", passwd);
		List<User> list = testService.findAllByParamters(User.class, map);
		System.out.println(list.size());
		if(list.size()==1){
			/*设置客户端和服务器之间的session属性
			 * 如果不设置session属性会？
			 * 如果设置session属性会？
			 * */
			session.setAttribute("user", username);
			/*向客户端发送cookie*/
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
			System.out.println("cookie name:"+cookie.getName()+"cookie value :"+cookie.getValue());
			return "/back/welcome";
		}else{
			return "login_error";
		}
	}
	
	@RequestMapping("register")
	public String register(){
		System.out.println("register");
		return "register";
	}
}
