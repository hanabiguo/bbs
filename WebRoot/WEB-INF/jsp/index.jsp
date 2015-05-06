<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<c:choose>
		<c:when test="${user==null}">
		<a href="${pageContext.request.contextPath }/LoginUI.do">登录</a>
		<a href="${pageContext.request.contextPath }/RegisterUI.do">注册</a>
		</c:when>
		
		<c:otherwise>
		
		${user.username}已登录 <a href="${pageContext.request.contextPath }/Logout.do">注销</a><br/>
		<html:form action="/SubmitCom">
			<html:textarea property="comment.message" rows="7" cols="39" style="resize:none;"></html:textarea>
			<html:submit></html:submit>
		</html:form>
		
		</c:otherwise>
	</c:choose>
	
	<br/>
	<c:forEach var="comment" items="${Comments}">
		${comment.username }<br/>
		${comment.message }<br/>
		${comment.time }<br/>
	</c:forEach>
</body>
</html>
