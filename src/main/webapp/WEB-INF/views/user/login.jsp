<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div style="color: red;"><c:out value="${msg}" ></c:out></div>
	<form action="login" method="post">
		<h1>登录</h1>
		用户名：<input type="text" name="username"/><br/>
		密码：<input type="password" name="password"/><br/>
		<input type="submit" value="登录"/>
	</form>
</div>
</body>
</html>