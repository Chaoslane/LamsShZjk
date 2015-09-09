<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>日志列表</title>
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h2>日志列表</h2>
			<c:forEach var="file" items="${listFile}" varStatus="count">
				<div class="row">
					<div class="col-md-1">${count.index+1}</div>
					<div class="col-md-4">${file.name}</div>
					<div class="col-md-1">
						<a href="${pageContext.request.contextPath}/viewLog?logFilePath=${file.name}&fileType=${fileType}&rand=<%=Math.random()%>"> 查看</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</body>
</html>
