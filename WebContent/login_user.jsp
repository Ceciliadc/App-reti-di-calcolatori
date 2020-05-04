<%@page import="java.util.*"%>
<%@page import="java.util.Date.*"%>
<%@page import="java.io.IOException" %>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login_user</title>
</head>
<body>

	<h1>Per favore, inserire numero di telefono: </h1>
	<form action="gestione.jsp" method="post">
		<pre>num telefono: &#9;<input type="tel" name="num_telefono" width="10"/></pre>
		<input type="submit" value="login"/>
	</form>

<br>
<form action="index.jsp" method = "post">
	<input type = "submit" value = "Torna a menu principale">
</form>

</body>
</html>