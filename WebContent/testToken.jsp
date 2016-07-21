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
	<%-- <s:form action="tokenAction" method="post">
	<s:label>用户名</s:label>
		<s:textfield name="username" value=""></s:textfield>
		<s:submit value="提交" />
		<s:token></s:token>
		
	</s:form> --%>
	
	<s:form action="tokenAction!execute" method="post">
		<s:textfield name="name" />
		<s:textfield name="age" />
		<s:textfield name="d" />
		<s:textfield name="time" />
		<s:checkboxlist name="habit" label="喜好" labelposition="left" list="{'足球','篮球','乒乓球'}"/>
		<s:submit value="提交" />
	</s:form>
	<s:debug></s:debug>
	<%-- <s:fielderror/> --%>
</body>
</html>