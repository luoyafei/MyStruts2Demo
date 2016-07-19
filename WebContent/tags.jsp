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
		<s:property value="user.userName" />
		<s:property value="user.password" />
		<hr/>
		<s:set var="adminName" value="user.userName"/>
		使用actionContext中的值<s:property value="adminName"/>
		<hr/>
		使用request中的值<s:property value="#request.adminName"/>
		<%-- <%=pageContext.getAttribute("userName") %> --%>
		<hr/>
		使用bean：
		<s:bean var="myCat" name="com.struts.bean.Cat">
			<s:param name="name" value="'cat'"></s:param>
			<s:param name="age" value="22"></s:param>
		</s:bean>
	`	<s:property value="#myCat"/>
	
		<hr/>
		<br />
		使用if elseif else
		age值：<s:property value="#parameters.age[0]" />
		<s:set var="age" value="#parameters.age[0]" />
		<s:if test="#parameters.age[0] < 0">wrong age!</s:if>
		<s:elseif test="#parameters.age[0] < 20"> too young!</s:elseif>
		<s:else>false</s:else>
		
		<hr/>
		<br/>
		使用s:iterator
		<s:iterator value="{1,2,3,4}">
			<s:property />
		</s:iterator>
		<br/>
		<s:iterator value="{'aaa','ccc','bbb'}" var="x">
			<s:property value="#x.toUpperCase()" />
		</s:iterator>
		<br/>
		<s:iterator value="{'aa','bb','cc','dd'}" status="status">
			<s:property value="#status.index" />
		</s:iterator>
		<br/>
		<s:iterator value="#{1:'a',2:'b',3:'c'}">
			<s:property  value="key"/>|<s:property value="value"/>
		</s:iterator>
		<br/>
		<s:iterator value="#{1:'a',2:'b',3:'c'}" var="x">
			<s:property value="#x.key"/>|<s:property value="#x.value"/>
		</s:iterator>
		
		<s:debug></s:debug>
	</s:div>
	</strong>
</body>
</html>