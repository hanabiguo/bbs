<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	window.onload = function(){
		setTimeout("forward()",3000);
	}
	function forward(){
		window.location.href = "${pageContext.request.contextPath}";
	}
</script>
</head>
<body>
	注册成功，请通过收取邮箱邮件激活账号，三秒后跳转到首页
</body>
</html>
