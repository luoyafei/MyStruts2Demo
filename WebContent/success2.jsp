<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功返回页面！</title>
</head>
<body>
	<s:div>
		<s:property value="#session.user.userName" />
		<s:property value="#session.user.password" />
	</s:div>
	success2.jsp
</body>
</html>