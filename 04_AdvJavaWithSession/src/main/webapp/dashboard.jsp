<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<h1>Welcome to Dashboard</h1>
<%
	Integer useridheder = (Integer) session.getAttribute("userIdInSession");
	String useremailheader = (String) session.getAttribute("userEmailInSession");
	out.println(useridheder);
	out.println(useremailheader);
%>
</body>
</html>