<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!static int pagecounter=0; %>
<% 
String uname=request.getParameter("username");
String pwd=request.getParameter("password");
session.setAttribute("username", "akash1502");
session.setAttribute("password","password");

if(uname.equals(session.getAttribute("username")) && pwd.equals(session.getAttribute("password")))
{
	out.println("Login Successful!");
	pagecounter++;
	%><br><br>Welcome <% 	out.print(request.getParameter("username")); %>
	<br><br>
	<%	out.print("Logged in "+pagecounter+" times");		
}
else
{
	out.print("Invalid credentials! Please try again");
}
	
%>


</body>
</html>