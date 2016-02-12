<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet type="text/css" href="/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="/js/jquery-1.12.0.min.js"></script>
<script type="text/javascrpit" src="/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h3>wondering 后台管理系统</h3>
<nav class="navbar navbar-default" role="navigation">
   <div class="navbar-header">
      <a class="navbar-brand" href="#">首页</a>
   </div>
   <div>
      <ul class="nav navbar-nav">
         <li><a href="#">基础信息</a></li>
         <li><a href="#">服务器运行信息</a></li>
         <li class="dropdown">
    	  <a class="dropdown-toggle" data-toggle="dropdown">配置信息<span class="caret"></span></a>
	      	<ul class="dropdown-menu">
		         <li><a href="#">模块配置</a></li>
		         <li><a href="#">功能配置</a></li>
		         <li><a href="#">权限配置</a></li>
		         <li class="divider"></li>
		         <li><a href="#">未定义</a></li>
		         <li><a href="#">数据库字典</a></li>
	     	 </ul>
  		 </li>
      </ul>
   </div>
</nav>
</body>
</html>