<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>websocket2.html</title>
<script type="text/javascript">
	var wsuri = "ws://localhost:8080/Java8Web/Websocket2";
	var ws = null;
	function startWebSocket() {
		if ('WebSocket' in window)
			ws = new WebSocket(wsuri);
		else if ('MozWebSocket' in window)
			ws = new MozWebSocket(wsuri);
		else
			alert("not support");

		ws.onmessage = function(evt) {
			console.log(evt.data);
		};

		ws.onclose = function(evt) {
			console.log("close");
		};

		ws.onopen = function(evt) {
			console.log("open");
		};
	}

	function sendMsg() {
		ws.send(document.getElementById("writeMsg").value);
	}
</script>
</head>
<body onload="startWebSocket();">
	<input type="text" id="writeMsg" />
	<input type="button" value="send" onclick="sendMsg()" />
</body>
</html>