<%@ page import="ar.edu.unlam.tallerweb.domain.Persona" %>
<%@ page import="java.util.LinkedList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Ejemplo SpringMVC</title>
</head>
<body>
<h1>Hola lista de personas</h1>

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