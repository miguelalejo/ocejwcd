<%@ page import="ec.ocwcd.cap16.Persona" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%
      Persona persona = new Persona();
     request.setAttribute("personaRequest", persona);
    persona.setNombre("Reny");
    persona.setEdad(10);
%>
<jsp:useBean id="personaRequest" type="ec.ocwcd.cap16.IPersona" scope="request">
    saludo Request
</jsp:useBean>
${personaRequest.nombre}
</body>
</html>