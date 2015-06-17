<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="ar.edu.unlam.tallerweb.domain.Persona" %>
<%@ page import="java.util.LinkedList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de personas</title>
</head>
<body>

<h1>Hola lista de Personas</h1>

<table>
	<c:forEach items="${lista}" var="persona">
	    <tr>
	    	<td>${persona.nombre}</td>
	    	<td> ${persona.apellido}</td>
	    	<td> ${persona.edad}</td>
	    	<td> ${persona.email}</td>
    	</tr>
	</c:forEach>
</table>

</body>
</html>