package com.bbs.wondering;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class QueryFilter {
	private HttpServletRequest req=null;
	
	
	public QueryFilter(HttpServletRequest req){
		Enumeration <String> paramEnu = req.getParameterNames();
		while(paramEnu.hasMoreElements()){
			String paraName =  paramEnu.nextElement();
			System.out.println(paraName);
			if(paraName.startsWith("Q_")){
				String value = req.getParameter(paraName);
			}
		}
	}

	public HttpServletRequest getReq() {
		return this.req;
	}
}
