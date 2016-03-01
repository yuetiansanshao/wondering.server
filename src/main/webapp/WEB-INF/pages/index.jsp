<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet type="text/css" href="/bootstrap/css/bootstrap.css" >
<link rel="stylesheet type="text/css" href="/css/uploadify.css" >
<script type="text/javascript" src="/js/jquery-1.12.0.min.js"></script>
<script type="text/javascrpit" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/jquery.uploadify.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#fileupload").uploadify({
			height:30,
			swf:"/swf/uploadify.swf",
			uploader:"/main/upload",
			width:120,
			method:'post'});
	});
/*  	function fileupload(){
		alert(111);
		var filename = $("#file").val();
		alert(filename);
		
	}  */
</script>
</head>
<body>
<div class="navbar navbar-inverse">
	<a style="float: left" href="/"><img src="images/logo.png" alt="" /></a>
	<ul class="nav nav-tabs">
			<li>
				<a href="/">主页</a>   
			</li>
			<li>
				<a href="/">关于我们</a>
			</li>
			<li>
				<a href="/">公司产品</a>
			</li><li>
				<a href="/">合作案例</a>
			</li><li>
				<a href="/">解决方案</a>
			</li>
	</ul>
</div>
<div>
		
			<div class="input-append">
				<input type="text" class="span2 search-query">
				<button type="submit" class="btn">Search</button>
			</div>
			<div>
				<form class="form-search" enctype="multipart/form-data">
					<input id="fileupload" type="file" width="20px" name="fileupload"/>
<!-- 					<input type="button" value="上传" onclick="fileupload()"/> -->
				</form>
			</div>

</div>
</body>
</html>