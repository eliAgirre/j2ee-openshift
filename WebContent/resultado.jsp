<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirma</title>
</head>
<jsp:useBean id="user" scope="request" class="bean.User"/>
<body>
	<p>Hola <strong><%=user.getUsername() %></strong></p>
	<a href="index.html">Volver</a>
</body>
</html>