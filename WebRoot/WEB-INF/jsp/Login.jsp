<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<html:form action="/Login">
		账号:<html:text property="user.username"/><br/>
		密码:<html:password property="user.password" redisplay="false"/><br/>
		<input type="submit" value="登录" />${errors }
	</html:form>
</body>
</html>
