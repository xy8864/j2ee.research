<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ page language="java" isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
    <title>
    <% if (exception != null && !exception.toString().contains("not doingMultiTask")) {%>

    <% }%>
      <% if (exception != null && exception.toString().contains("not doingMultiTask")) {%>
   	操作不规范
    <% }%>

    </title>
</head>

<body id="error">
    <div id="page">
        <div id="content" class="clearfix">
            <div id="main" >
                <div>
					<table style="background:#cecece;text-align:center;margin:0 auto;border:10px solid #cecece;-moz-border-radius:10px;">
						<Tr>
							<Td>
								<table style="width:580px;text-align:center;margin:0 auto;-moz-border-radius:10px;background:#f2f2f2;">
									<Tr>
										<Td style="padding:30px;"></Td>
										<Td style="padding:30px;text-align:center;">
										<p style="font-size:20px;font-weight:bold;color:#BE0000;">
										<% if (exception != null && !exception.toString().contains("not doingMultiTask")) {%>System Error<% }%>
										<% if (exception != null && exception.toString().contains("not doingMultiTask")) {%>DoingMultiTask<% }%>
										</p>
										<p style="font-size:14px;font-weight:bold;color:#BE0000;">
										<% if (exception != null && !exception.toString().contains("not doingMultiTask")) {%>对不起，系统发生故障，请与管理员联系<% }%>
										<% if (exception != null && exception.toString().contains("not doingMultiTask")) {%>对不起，你还有尚未完成的操作<% }%>
										</p>
										</Td>
									</Tr>
								</table>
							</Td>
						</Tr>
					</table>
				</div>
                <div>
					<a style="font-weight:bold;font-size:14px;color:#F59829" href="<c:url value="/"/>">返回首页</a>
				</div>
                <%@ include file="/common/messages.jsp" %>
                 <% if (exception != null) { %>
                    <pre style="display:block"><% exception.printStackTrace(new java.io.PrintWriter(out)); %></pre>
                 <% } else if ((Exception)request.getAttribute("javax.servlet.error.exception") != null) { %>
                    <pre style="display:block"><% ((Exception)request.getAttribute("javax.servlet.error.exception"))
                                           .printStackTrace(new java.io.PrintWriter(out)); %></pre>
                 <% } %>
            </div>
        </div>
    </div>
</body>
</html>
