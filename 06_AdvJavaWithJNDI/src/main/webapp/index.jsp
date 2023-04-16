<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First J2EE App</title>
</head>
<body>
	<h3>Welcome to J2EE Application</h3>
	<h4>Login Page</h4>
	<h6 style="color: red;">${errormessage}</h6>
	<form action="LoginController" method="post">
		Email : <input type="email" name="email" /> <br> Password : <input
			type="password" name="password" /> <br> <input type="submit"
			value="Login">
	</form>

	<h4>=================Filter Example=================</h4>

	<form action="servlet1" method="post">
		Name:<input type="text" name="name" /><br />
		Password:<input	type="password" name="password" /><br /> 
		<input type="submit" value="login">
	</form>

</body>
</html>