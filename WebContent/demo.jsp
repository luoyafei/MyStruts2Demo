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
	<strong>
	<s:div>
		<%-- <s:property value="#application.user.userName" />
		<s:property value="password" /> --%>
		<s:fielderror></s:fielderror>
		<br />
		<s:property value="#request"/>
		
		<s:property value="errors.user[0]"/>
		<s:property value="errors.user[1]"/>
		<s:debug></s:debug>
	</s:div>
	</strong>
</body>
</html>