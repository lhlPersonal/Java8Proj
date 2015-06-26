<%@ page language="java" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'chainTest.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<body>
	aaaaaa
	<!-- ------jsp forward:forward页面替代当前页面------- -->
	<%-- <jsp:forward page="test.jsp">
		<jsp:param value="this is param one" name="param1" />
	</jsp:forward> --%>
	<!-- ------jsp include:插入页面内容------- -->
	<jsp:include page="test.jsp">
		<jsp:param value="this is param one" name="param1" />
	</jsp:include>



</body>
</html>

\d{1-9}