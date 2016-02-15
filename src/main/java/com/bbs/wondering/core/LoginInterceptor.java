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
			if(cookies!=null){
				for(Cookie c : cookies){
					if("true".equals(c.getValue())){
					//	session.setAttribute("user",c.getName());
						isExit = true;
					}
				}
			}
			System.out.println("prehandle");
			if(!isExit){
				if(url.endsWith("login.html")){
					return true;
				}
				//重定向地址栏不会变
				//req.getRequestDispatcher(LOGIN_URL).forward(req, res);	
				//重定向地址栏会变
				res.sendRedirect(LOGIN_URL);
				return false;
			}else{
				if(url.endsWith("login.html")){
					req.getRequestDispatcher("/WEB-INF/pages/back/welcome.jsp").forward(req, res);
					return false;
				}else{
					return true;
				}
			}
		}
}
