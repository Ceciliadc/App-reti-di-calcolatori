<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Inserire username e password: </h1>
	<form action="LogCheck" method="post">
		<pre>admin: &#9; &#9;<input type="text" name="admin" width="30"/></pre>
		<pre>password: &#9;<input type="password" name="password" width="10"/></pre>
		<input type="submit" value="login"/>
	</form>

</body>
</html>