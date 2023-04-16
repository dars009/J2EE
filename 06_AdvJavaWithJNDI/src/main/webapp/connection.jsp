<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<body>
	<sql:setDataSource var="webappDataSource" dataSource="jdbc/UsersDB" />
	<c:set var="webappDataSource" scope="request" />
</body>
</html>

