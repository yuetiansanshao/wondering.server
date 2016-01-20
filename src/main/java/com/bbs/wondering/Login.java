package com.bbs.wondering;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class Login {
	
	@RequestMapping("/login.html")
	public String login(HttpServletRequest re){
		String name=re.getParameter("name");
		System.out.println("name :"+name);
		QueryFilter filter = new QueryFilter(re);
		ModelAndView mv = new ModelAndView("index.jsp");
		System.out.println("run login");
		Map<String,Object> map = mv.getModel();
		for(String key : map.keySet() ){
			System.out.println("key :"+key+", value :"+map.get(key));
		}
		return "welcome";
	}
/*	
	@RequestMapping("/login.html")
	public String test(HttpRequestHandlerServlet res){
	}*/
}
