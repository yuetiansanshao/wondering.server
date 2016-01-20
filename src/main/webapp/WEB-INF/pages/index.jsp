<%-- <%@page import="wondering.bbs.base.util.ContextUtil"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String basePath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>wondering bbs</title>
<%-- <script type="text/javascript" src="<%=basePath %>/widget/js/jquery.js?ver=<%=ContextUtil.getVersion() %>"></script> --%>
<script type="text/javascript" src="<%=basePath %>/widget/js/jquery-1.12.0.min.js"></script>
</head>
<body>
spring mvc test;
<form action="/main/login.html" method="get">
	<table>
		<tr>
			<td>账号</td>
			<td>
				<input name="name" type="text"/>
			</td>
			<td>
				<input  type="submit" value="testsubmit" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>