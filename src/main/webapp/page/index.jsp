<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Lams接口控制台</title>
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
	</head>
	<script type="text/javascript">
	function submitSyncUserGroup(){
		var r=confirm("慎重: 确定进行用户同步吗?");
		if (r==true){
			window.location.assign("/LamsIFML/syncUserGroup");
		}else{
			alert("取消!");
		}
	}
	</script>
<body>
	<div class="container theme-showcase">
		<p>
			<!-- 
			<button class="btn btn-lg btn-warning" onclick="submitSyncUserGroup()">同步用户和部门</button>
			<br>
			<a class="btn btn-lg btn-default"
				href="${pageContext.request.contextPath}/gepsCtl/testGeps">查看项目个数 (测试)</a>
			<br>
			<a class="btn btn-lg btn-danger"
				href="${pageContext.request.contextPath}/initMapping">初始化接口代码表</a><br>
			<a class="btn btn-lg btn-info"
				href="${pageContext.request.contextPath}/gepsSync">接收项目档案数据</a>
			 -->
			<a class="btn btn-lg btn-primary"
	 			href="${pageContext.request.contextPath}/viewLogList">查看日志</a>
			<a class="btn btn-lg btn-primary"
	 			href="${pageContext.request.contextPath}/oadataReceive">数据接收</a>
		</p>
	</div>
</body>
</html>
