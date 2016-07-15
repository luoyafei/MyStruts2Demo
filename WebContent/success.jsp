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
		welcome to this page ! success.jsp
		<s:property value="user.userName" />
		<s:property value="user.password" />
	</s:div>
</body>
</html>