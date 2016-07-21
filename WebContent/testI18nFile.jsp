<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
</script>
</head>
<body>
	this world is beautiful!
	<s:text name="welcome">
		<s:param value="咯亚非"></s:param>
	</s:text>
	<br/>
	<s:a href="testi18n?request_locale=en_US">英文</s:a>
	<s:a href="testi18n?request_locale=zh_CN">中文</s:a>
	<s:debug></s:debug>
</body>
</html>