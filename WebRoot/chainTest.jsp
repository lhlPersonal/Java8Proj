<%@ page language="java"  pageEncoding="utf-8"%>
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
	<table id="tab">
		<tr>
			<td class="tb1_td5">
			<span id="min" style=" width:20px; height:18px;border:1px solid #ccc;" onclick="numDec(this)" />-</span>
			<input id="quantity" class="product_quentity" name="" type="text" value="1" style=" width:30px; text-align:center; border:1px solid #ccc;" onkeyup="keyUp()"/>
			<span id="add" style="width:20px; height:18px;border:1px solid #ccc;" onclick="numAdd(this)" />+</span>
				</td>
			<td class="tb1_td6">
			<input id="price" class="productprice" style="color:#ff5500;font-size:14px; font-weight:bold;" value="40">
			</td>
		</tr>
		<tr>
			<td class="tb1_td5">
			<span id="min" style=" width:20px; height:18px;border:1px solid #ccc;" onclick="numDec(this)" />-</span>
			<input id="quantity" class="product_quentity" name="" type="text" value="1" style=" width:30px; text-align:center; border:1px solid #ccc;" onkeyup="keyUp()"/>
			<span id="add" style="width:20px; height:18px;border:1px solid #ccc;" onclick="numAdd(this)" />+</span>
				</td>
			<td class="tb1_td6">
			<input id="price" class="productprice" style="color:#ff5500;font-size:14px; font-weight:bold;" value="30">
			</td>
		</tr>
		<tr>
			<td class="tb1_td5">
			<span id="min" style=" width:20px; height:18px;border:1px solid #ccc;" onclick="numDec(this)" />-</span>
			<input id="quantity" class="product_quentity" name="" type="text" value="1" style=" width:30px; text-align:center; border:1px solid #ccc;" onkeyup="keyUp()"/>
			<span id="add" style="width:20px; height:18px;border:1px solid #ccc;" onclick="numAdd(this)" />+</span>
				</td>
			<td class="tb1_td6">
			<input id="price" class="productprice" style="color:#ff5500;font-size:14px; font-weight:bold;" value="50">
			</td>
		</tr>
		<tr>
			<td class="tb1_td5">
			<span id="min" style=" width:20px; height:18px;border:1px solid #ccc;" onclick="numDec(this)" />-</span>
			<input id="quantity" class="product_quentity" name="" type="text" value="1" style=" width:30px; text-align:center; border:1px solid #ccc;" onkeyup="keyUp()"/>
			<span id="add" style="width:20px; height:18px;border:1px solid #ccc;" onclick="numAdd(this)" />+</span>
				</td>
			<td class="tb1_td6">
			<input id="price" class="productprice" style="color:#ff5500;font-size:14px; font-weight:bold;" value="20">
			</td>
		</tr>
	</table>
	
	total price:<span id="totalPrice" style="color:#ff5500;font-size:14px; font-weight:bold;"></span>
</body>
</html>
<script type="text/javascript" src="js/jquery.js">
</script>
<script type="text/javascript" src="js/shopping.js">
</script>