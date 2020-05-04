<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src ="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src ="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        
   <script>
            $(function() {
                $("#datepicker").datepicker({dateFormat: "dd-mm-yy"});
            });
        </script>

	<title>Prenota</title>

</head>
<body bgcolor="#F3F3F3">
    <h1>Osteria Modenese</h1>
    <p> Prenota un tavolo </p>

	<form action="Insert_Data" method="post">
	Nome:<br>
	<input type="text" name="nome"><br>
	Cognome:<br>             
	<input type="text" name="cognome"><br>
	Scegli data: <br>  
	<input type="text" name="data_prenotazione" id="datepicker"><br>
	Turno: <br>
	<input type="checkbox" name="turno" value="19:30">19:30<br>
	<input type="checkbox" name="turno" value="21:00">21:00<br>
	Num persone: <br>
	<input type="number" name="num_persone"><br>
	Num telefono:<br>
	<input type="tel" name="num_telefono"><br>
	
	<br><input type="submit" value="Inserisci"><br>
	</form>
<br>
<form action="index.jsp" method = "post">
	<input type = "submit" value = "Torna a menu principale">
</form>

</body>
</html>