<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="mylogin" method="post" namespace="/">
		<s:textfield name="userName" label="用户名" />
		<s:password name="password" label="密码" />
		<s:submit value="提交" />
	</s:form>
	<s:a href="register.jsp">注册</s:a>
</body>
</html>