<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>blog</title>
</head>
<body>
<br>
<audio controls="controls" autoplay loop>
	<source src="audio/Atc - Thinking Of You.mp3" type="audio/mpeg">
</audio>

<center><h1>博客首页</h1></center>
<div align="center">
	<a href='<s:url value="/user/login" />'>登录</a> | <a href='<s:url value="/user/register" />'>注册</a>
</div>

<c:forEach items="${contents}" var="content">
	title:<c:out value="${content.title}"></c:out><br>
	内容：<br>
	${content.content}
</c:forEach>
</body>
</html>