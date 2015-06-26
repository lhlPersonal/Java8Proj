<!DOCTYPE HTML>
<html>
<head>
<base href="${pageContext.request.contextPath}${'/'}">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function doSubmit() {
		$.ajax({
			url : "firstServlet",
			type : "post",
			dataType : "text",
			data : {
				"p" : $("#name").val()
			},
			success : function(data) {
				alert(data);
			}
		});
	}
</script>
</head>

<body>
	<input type="text" id="name">
	<button type="button" onclick="doSubmit()">commit</button>
</body>
</html>
<script type="text/javascript" src="js/jquery.js">
	
</script>
