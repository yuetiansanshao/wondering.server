package com.bbs.wondering.core;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	
	private static final String LOGIN_URL="/";
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after prehandle");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("post handle");
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object object) throws Exception {
		/*// TODO Auto-generated method stub
		获取session属性
		 * 如果没有设置属性会？
		 * 如果是设置了session属性会？
		 */ 
		String url = req.getRequestURL().toString();
		System.out.println(url);
		HttpSession session = req.getSession();
		Cookie[] cookies = req.getCookies();
		boolean isExit = false;
		for(Cookie c : cookies){
			if("username".equals(c.getName())){
				session.setAttribute("user",c.getName());
				isExit = true;
			}
		} 
		if(!isExit){
			//重定向
			req.getRequestDispatcher(LOGIN_URL).forward(req, res);	
		}
		System.out.println("prehandle");
		return true;
	}
}
