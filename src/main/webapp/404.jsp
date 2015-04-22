<%@ page errorPage="/error.jsp"  contentType="text/html; charset=utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<page:applyDecorator name="default">
<title>404</title>
<content tag="heading">404</content>
<div style="padding:100px;">
	<table style="background:#cecece;text-align:center;margin:0 auto;border:10px solid #cecece;-moz-border-radius:10px;">
		<Tr>
			<Td>
				<table style="width:580px;text-align:center;margin:0 auto;-moz-border-radius:10px;background:#f2f2f2;">
					<Tr>
						<Td style="padding:30px;"></Td>
						<Td style="padding:30px;text-align:center;">
						<p style="font-size:20px;font-weight:bold;color:#F59829;">Not Found Error</p>
						<p style="font-size:14px;font-weight:bold;color:#F59829;">对不起，您请求的页面不存在，请与管理员联系</p>
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
</page:applyDecorator>
