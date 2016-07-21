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
	<s:property value="name"/>
	<s:property value="age"/>
	<s:date name="d" format="yyyy/MM/dd HH:mm:ss" />
	<s:date name="time" format="yyyy/MM/dd HH:mm:ss"/>
	<s:property value="habit"/>
	<s:debug></s:debug>
</body>
</html>