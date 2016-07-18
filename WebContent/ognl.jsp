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
		List:<s:property value="cattles.{?#this.age==1}.{age}[0]==null"/>
		<br />
		<s:property value="[1]" />
		<s:debug></s:debug>
	</s:div>
	</strong>
</body>
</html>