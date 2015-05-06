<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ajax.js"></script>
</head>
<body>
	<html:form action="/Register">
		账号:<html:text property="user.username" onchange="callServer();"/><html:errors property="username"/>${username }<span id="existornot"></span><br/>
		密码:<html:password property="user.password" redisplay="false"/><html:errors property="password"/><br/>
		邮箱:<html:text property="user.email"/><html:errors property="email"/><br/>
		<input type="submit" value="注 册" />
	</html:form>
</body>
</html>
