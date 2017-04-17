<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
<div align="center">
	<sf:form method="post" commandName="user">
		<h1>注册</h1>
		用户名：<sf:input path="username"/> <br/>
		密码：<sf:password path="password"/> <br/>
		姓名：<sf:input path="xm"/> <br/>
		性别：<sf:input path="sex"/> <br/>
		年龄：<sf:input path="age"/> <br/>
		出生日期：<sf:input path="birthday"/> <br/>
		家庭地址：<sf:input path="address"/> <br/>
		邮件地址：<sf:input path="email"/> <br/>
		QQ号码：<sf:input path="qq"/> <br/>
		主页：<sf:input path="pagehome"/> <br/>
		<input type="submit" value="注册" /> | <input type="reset" value="重置" />
	</sf:form>
</div>
</body>
</html>