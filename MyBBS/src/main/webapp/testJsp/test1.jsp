<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../common/pageTaglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../common/linkAndScriptRef.jsp"%>
<title>Insert title here</title>

<style type="text/css">
a{
	text-decoration: blink;
}
</style>
</head>
<body>

<a href="${rootPath}/baseJsp/test">用于测试test的log打印到控制台和文件夹</a><br>
<a href="${rootPath}/baseJsp/insertUsers">插入10条用户user数据（自己可以去方法灵活插入）</a>
</body>
</html>