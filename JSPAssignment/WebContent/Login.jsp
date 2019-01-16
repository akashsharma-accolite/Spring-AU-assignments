<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="LoginRequest.jsp">
	<fieldset>
	<legend>Login Form:</legend>
		<input type="text" placeholder="Enter username" name="username" required>
		<br><br>
		<input type="password" placeholder="Enter Password" name="password" required>
		<br><br>
		<input type="submit" value="Login">
		<br><br>
	</form>
	</fieldset>
</body>
</html>