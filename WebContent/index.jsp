<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%!
	public int isEmpty(String str) {
		if(str != null && str.trim().hashCode() != 0)
			return 1;
		else
			return 0;
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(isEmpty(userName) == 1 && isEmpty(password) == 1)
			out.println("用户名或密码错误！");
	%>
	
	<s:form action="mylogin" method="post" namespace="/">
		<s:textfield name="user.userName" label="用户名" />
		<s:password name="user.password" label="密码" />
		<s:submit value="提交" />
	</s:form>
	<s:a href="mylogin!reg">注册</s:a>
	<s:a href="mylogin!rrdir">测试debug</s:a>
	<s:a href="mylogin!ognl">测试OGNL</s:a>
	
	
	<s:form action="mylogin!tags" method="post" namespace="/">
		<s:textfield name="user.userName" label="用户名" />
		<s:password name="user.password" label="密码" />
		<s:submit value="测试tags" />
	</s:form>
	
</body>
</html>