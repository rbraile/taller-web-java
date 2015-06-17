<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>Formulario</title>
</head>
<body>
<h1>Formulario para ingreso de personas</h1>
<form:form action="/formulario2" method="post" commandName="persona">
	<form:label path="nombre">
		Ingrese nombre
	</form:label>
	<form:input path="nombre"></form:input>
	<br />
	
	<form:label path="apellido">
		Ingrese apellido
	</form:label>
	<form:input path="apellido"></form:input>
	<br />
		
	<form:label path="email">
		Ingrese email
	</form:label>
	<form:input path="email"></form:input>
	<br />
		
	<form:label path="edad">
		Ingrese edad
	</form:label>
	<form:input path="edad"></form:input>
	<br />
	
	<button id="acceptButton" title="enviar" type="submit">
		enviar datos
	</button>
</form:form>

<form>
	
</form>


</body>
</html>