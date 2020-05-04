<%@page import="java.util.*"%>
<%@page import="common.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>welcome</title>
</head>
<body>
<h1>Prenotazioni</h1> 
<table border="1">

<%
	Show_Data show_data = new Show_Data();
	List<User> list = show_data.get_data();
	Iterator<User> it_list=list.iterator();
%>

<tr>
   <th ALIGN="center" WIDTH="15%">Nome</th>
   <th ALIGN="center" WIDTH="15%">Cognome</th>
   <th ALIGN="center" WIDTH="10%">Data Prenotazione</th>
   <th ALIGN="center" WIDTH="10%">Turno</th>
   <th ALIGN="center" WIDTH="10%">Numero Persone</th>
   <th ALIGN="center" WIDTH="20%">Numero Telefono</th>
   <th ALIGN="center" WIDTH="10%">Conferma</th>
</tr>
 
<%
User obj_User=new User();
while(it_list.hasNext()){
obj_User=it_list.next();
%>

<tr>

	<td ALIGN="center"><%=obj_User.getNome() %></td>
	<td ALIGN="center"><%=obj_User.getCognome() %></td>
	<td ALIGN="center"><%=obj_User.getData_prenotazione() %></td>
	<td ALIGN="center"><%=obj_User.getTurno() %></td>
	<td ALIGN="center"><%=obj_User.getNum_persone() %></td>
	<td ALIGN="center"><%=obj_User.getNum_telefono() %></td>
		
	<td ALIGN="center">
		<form action = "Update_Data" method = "post">
		<input type="hidden" name="tel" value="<%=obj_User.getNum_telefono()%>"/>
		<input type="hidden" name="data" value="<%=obj_User.getData_prenotazione()%>"/>
		<% if (obj_User.getConferma().equals("Confermata")){ %>
			Confermata
		<%} else if (obj_User.getConferma().equals("Rifiutata")) {%>
			Rifiutata
		<%} else { %>
			<select name = "confirmation">
				<option value = "Da confermare"> Da confermare
				<option value = "Confermata"> Confermata
				<option value = "Rifiutata"> Rifiutata
			</select>
			<input type = "submit" value = "Invia">
		<%} %>
		</form>
	</td>

</tr>
	
	
<% } %>

</table>

<br>
<form action="index.jsp" method = "post">
	<input type = "submit" value = "Torna a menu principale">
</form>

</body>
</html>