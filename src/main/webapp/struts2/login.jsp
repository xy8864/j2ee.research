<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglibs.jsp"%>
<html>
<head>
	<title></title>

</head>
<body>
<s:debug/>

struts.view_uri:${requestScope['struts.view_uri']}|<s:property value="#requestScope['struts.view_uri']"/><br/>
<!--s:fielderror/-->
<s:if test="hasFieldErrors()">
	<s:iterator value="fieldErrors">
		<li style="font:#ff273f;"><s:property value="value[0]"/></li>
	</s:iterator>
</s:if>
<s:if test="hasActionErrors()">
	<s:iterator value="actionErrors">
		<li style="font:#ff273f;"><s:property value="value[0]"/></li>
	</s:iterator>
</s:if>
<s:form action="login">
	<!--s:token/-->
	<s:textfield label="账号" name="user.username" />
	<s:textfield label="密码" name="user.password" />
	<s:textfield type="checkbox" label="运动" name="habits" value="sports"/>
	<s:textfield type="checkbox" label="读书" name="habits" value="reading"/>
	<s:textfield type="checkbox" label="睡觉" name="habits" value="sleep"/>
	<s:submit />
</s:form>
</body>
</html>
