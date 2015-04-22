<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglibs.jsp"%>
<html>
<head>
	<title></title>
</head>
<body>
<s:if test="hasFieldErrors()">
	<s:iterator value="fieldErrors">
		<li style="font:#ff273f;"><s:property value="value[0]"/></li>
	</s:iterator>
</s:if>
</body>
</html>
